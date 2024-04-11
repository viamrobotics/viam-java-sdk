/*
 * Adapted from https://github.com/grpc/grpc-java/blob/master/services/src/main/java/io/grpc/protobuf/services/ProtoReflectionService.java
 *
 * Copyright 2016 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.viam.sdk.core.rpc;

import static com.google.common.base.Strings.lenientFormat;

import com.google.protobuf.DescriptorProtos.DescriptorProto;
import com.google.protobuf.DescriptorProtos.FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos.FileDescriptorProto;
import com.google.protobuf.DescriptorProtos.FileDescriptorSet;
import com.google.protobuf.DescriptorProtos.MethodDescriptorProto;
import com.google.protobuf.DescriptorProtos.ServiceDescriptorProto;
import com.google.protobuf.InvalidProtocolBufferException;
import com.viam.sdk.core.rpc.reflectionv1alpha.ErrorResponse;
import com.viam.sdk.core.rpc.reflectionv1alpha.FileDescriptorResponse;
import com.viam.sdk.core.rpc.reflectionv1alpha.ServerReflectionGrpc.ServerReflectionImplBase;
import com.viam.sdk.core.rpc.reflectionv1alpha.ServerReflectionRequest;
import com.viam.sdk.core.rpc.reflectionv1alpha.ServerReflectionRequest.MessageRequestCase;
import com.viam.sdk.core.rpc.reflectionv1alpha.ServerReflectionResponse;
import io.grpc.Status;
import io.grpc.Status.Code;
import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;

public class ProtoReflectionService extends ServerReflectionImplBase {

  @Override
  public StreamObserver<ServerReflectionRequest> serverReflectionInfo(
      final StreamObserver<ServerReflectionResponse> responseObserver) {
    final ServerCallStreamObserver<ServerReflectionResponse> serverCallStreamObserver =
        (ServerCallStreamObserver<ServerReflectionResponse>) responseObserver;
    ProtoReflectionStreamObserver requestObserver =
        new ProtoReflectionStreamObserver(serverCallStreamObserver);
    serverCallStreamObserver.setOnReadyHandler(requestObserver);
    serverCallStreamObserver.disableAutoRequest();
    serverCallStreamObserver.request(1);
    return requestObserver;
  }

  private static class ProtoReflectionStreamObserver
      implements Runnable, StreamObserver<ServerReflectionRequest> {

    private final ServerCallStreamObserver<ServerReflectionResponse> serverCallStreamObserver;

    // TODO(erd): support adding to this. protobuf-lite does not have descriptors built in,
    //   so we rely on them being generated into resources at build time. This could easily
    //   have a a method on here that API registration can use to thread through a FileDescriptorSet.
    private final FileDescriptorIndex fileDescriptorIndex;

    private boolean closeAfterSend = false;
    private ServerReflectionRequest request;

    ProtoReflectionStreamObserver(
        ServerCallStreamObserver<ServerReflectionResponse> serverCallStreamObserver) {
      this.serverCallStreamObserver = serverCallStreamObserver;
      this.fileDescriptorIndex = new FileDescriptorIndex();
    }

    @Override
    public void run() {
      if (request != null) {
        handleReflectionRequest();
      }
    }

    @Override
    public void onNext(ServerReflectionRequest request) {
      this.request = request;
      handleReflectionRequest();
    }

    private void handleReflectionRequest() {
      if (serverCallStreamObserver.isReady()) {
        if (Objects.requireNonNull(request.getMessageRequestCase())
            == MessageRequestCase.FILE_CONTAINING_SYMBOL) {
          getFileContainingSymbol(request);
        } else {
          sendErrorResponse(
              request,
              Code.UNIMPLEMENTED,
              "not implemented " + request.getMessageRequestCase());
        }
        request = null;
        if (closeAfterSend) {
          serverCallStreamObserver.onCompleted();
        } else {
          serverCallStreamObserver.request(1);
        }
      }
    }

    @Override
    public void onCompleted() {
      if (request != null) {
        closeAfterSend = true;
      } else {
        serverCallStreamObserver.onCompleted();
      }
    }

    @Override
    public void onError(Throwable cause) {
      serverCallStreamObserver.onError(cause);
    }

    private void sendErrorResponse(
        ServerReflectionRequest request, Status.Code code, String message) {
      ServerReflectionResponse response =
          ServerReflectionResponse.newBuilder()
              .setValidHost(request.getHost())
              .setOriginalRequest(request)
              .setErrorResponse(
                  ErrorResponse.newBuilder()
                      .setErrorCode(code.value())
                      .setErrorMessage(message))
              .build();
      serverCallStreamObserver.onNext(response);
    }

    private ServerReflectionResponse createServerReflectionResponse(
        ServerReflectionRequest request, FileDescriptorProto fd) {
      FileDescriptorResponse.Builder fdRBuilder = FileDescriptorResponse.newBuilder();

      Set<String> seenFiles = new HashSet<>();
      Queue<FileDescriptorProto> frontier = new ArrayDeque<>();
      seenFiles.add(fd.getName());
      frontier.add(fd);
      while (!frontier.isEmpty()) {
        FileDescriptorProto nextFd = frontier.remove();
        fdRBuilder.addFileDescriptorProto(nextFd.toByteString());
        for (String dependencyFdName : nextFd.getDependencyList()) {
          final FileDescriptorProto dependencyFd = fileDescriptorIndex.getFileDescriptorByName(
              dependencyFdName);
          checkState(dependencyFd != null, "dependency not in set: %s", dependencyFdName);
          if (!seenFiles.contains(dependencyFd.getName())) {
            seenFiles.add(dependencyFd.getName());
            frontier.add(dependencyFd);
          }
        }
      }
      return ServerReflectionResponse.newBuilder()
          .setValidHost(request.getHost())
          .setOriginalRequest(request)
          .setFileDescriptorResponse(fdRBuilder)
          .build();
    }

    private void getFileContainingSymbol(ServerReflectionRequest request) {
      String symbol = request.getFileContainingSymbol();
      final FileDescriptorProto fd = fileDescriptorIndex.getFileDescriptorBySymbol(symbol);
      if (fd != null) {
        serverCallStreamObserver.onNext(createServerReflectionResponse(request, fd));
      } else {
        sendErrorResponse(request, Status.Code.NOT_FOUND, "File not found.");
      }
    }
  }

  private static final class FileDescriptorIndex {

    private final Map<String, FileDescriptorProto> fileDescriptorsByName =
        new HashMap<>();
    private final Map<String, FileDescriptorProto> fileDescriptorsBySymbol =
        new HashMap<>();
    private final Map<String, Map<Integer, FileDescriptorProto>> fileDescriptorsByExtensionAndNumber =
        new HashMap<>();

    public FileDescriptorIndex() {
      final ByteBuffer ok = readResourceFile("/protofds/viam.api");
      try {
        final FileDescriptorSet fdSet = FileDescriptorSet.parseFrom(ok);
        for (FileDescriptorProto fd : fdSet.getFileList()) {
          processFileDescriptor(fd);
        }
      } catch (InvalidProtocolBufferException e) {
        throw new RuntimeException(e);
      }
    }

    @Nullable
    private FileDescriptorProto getFileDescriptorByName(String name) {
      return fileDescriptorsByName.get(name);
    }

    @Nullable
    private FileDescriptorProto getFileDescriptorBySymbol(String symbol) {
      return fileDescriptorsBySymbol.get(symbol);
    }

    @Nullable
    private FileDescriptorProto getFileDescriptorByExtensionAndNumber(String type, int number) {
      if (fileDescriptorsByExtensionAndNumber.containsKey(type)) {
        return fileDescriptorsByExtensionAndNumber.get(type).get(number);
      }
      return null;
    }

    @Nullable
    private Set<Integer> getExtensionNumbersOfType(String type) {
      if (fileDescriptorsByExtensionAndNumber.containsKey(type)) {
        return Collections.unmodifiableSet(fileDescriptorsByExtensionAndNumber.get(type).keySet());
      }
      return null;
    }

    private ByteBuffer readResourceFile(final String name) {
      final InputStream is = getClass().getResourceAsStream(name);
      final byte[] data;
      try {
        assert is != null;
        data = IOUtils.toByteArray(is);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      return ByteBuffer.wrap(data);
    }

    private void processFileDescriptor(FileDescriptorProto fd) {
      String fdName = fd.getName();
      checkState(!fileDescriptorsByName.containsKey(fdName), "File name already used: %s", fdName);
      fileDescriptorsByName.put(fdName, fd);
      final String packageName = fd.getPackage();
      for (ServiceDescriptorProto service : fd.getServiceList()) {
        processService(packageName, service, fd);
      }
      for (DescriptorProto type : fd.getMessageTypeList()) {
        processType(packageName, type, fd);
      }
      for (FieldDescriptorProto extension : fd.getExtensionList()) {
        processExtension(packageName, extension, fd);
      }
    }

    private void processService(final String prefix, ServiceDescriptorProto service,
        FileDescriptorProto fd) {
      String serviceName = String.format("%s.%s", prefix, service.getName());
      checkState(
          !fileDescriptorsBySymbol.containsKey(serviceName),
          "Service already defined: %s",
          serviceName);
      fileDescriptorsBySymbol.put(serviceName, fd);
      for (MethodDescriptorProto method : service.getMethodList()) {
        String methodName = String.format("%s.%s", serviceName, method.getName());
        checkState(
            !fileDescriptorsBySymbol.containsKey(methodName),
            "Method already defined: %s",
            methodName);
        fileDescriptorsBySymbol.put(methodName, fd);
      }
    }

    private void processType(final String prefix, DescriptorProto type, FileDescriptorProto fd) {
      String typeName = String.format("%s.%s", prefix, type.getName());
      checkState(
          !fileDescriptorsBySymbol.containsKey(typeName), "Type already defined: %s", typeName);
      fileDescriptorsBySymbol.put(typeName, fd);
      for (FieldDescriptorProto extension : type.getExtensionList()) {
        processExtension(prefix, extension, fd);
      }
      for (DescriptorProto nestedType : type.getNestedTypeList()) {
        processType(typeName, nestedType, fd);
      }
    }

    private void processExtension(final String prefix, FieldDescriptorProto extension,
        FileDescriptorProto fd) {
      // TODO(erd): correct from getContainingType?
      String extensionName = String.format("%s.%s", prefix, extension.getName());
      int extensionNumber = extension.getNumber();
      if (!fileDescriptorsByExtensionAndNumber.containsKey(extensionName)) {
        fileDescriptorsByExtensionAndNumber.put(
            extensionName, new HashMap<Integer, FileDescriptorProto>());
      }
      checkState(
          !fileDescriptorsByExtensionAndNumber.get(extensionName).containsKey(extensionNumber),
          "Extension name and number already defined: %s, %s",
          extensionName,
          extensionNumber);
      fileDescriptorsByExtensionAndNumber.get(extensionName).put(extensionNumber, fd);
    }
  }

  private static void checkState(
      boolean expression,
      @CheckForNull String errorMessageTemplate,
      @CheckForNull @Nullable Object... errorMessageArgs) {
    if (!expression) {
      throw new IllegalStateException(lenientFormat(errorMessageTemplate, errorMessageArgs));
    }
  }
}
