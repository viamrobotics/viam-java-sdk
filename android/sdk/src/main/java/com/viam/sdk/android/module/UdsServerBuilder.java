package com.viam.sdk.android.module;

import android.net.LocalSocketAddress.Namespace;
import io.grpc.InsecureServerCredentials;
import io.grpc.ServerBuilder;
import io.grpc.ServerCredentials;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import javax.annotation.Nullable;
import javax.net.ServerSocketFactory;

public final class UdsServerBuilder {

  @Nullable
  @SuppressWarnings("rawtypes")
  private static final Class<? extends ServerBuilder> OKHTTP_SERVER_BUILDER_CLASS =
      findOkHttp();

  private UdsServerBuilder() {
  }

  @SuppressWarnings("rawtypes")
  private static Class<? extends ServerBuilder> findOkHttp() {
    try {
      return Class.forName("io.grpc.okhttp.OkHttpServerBuilder")
          .asSubclass(ServerBuilder.class);
    } catch (ClassNotFoundException e) {
      return null;
    }
  }

  /**
   * Returns a channel to the UDS endpoint specified by the file-path.
   *
   * @param path      unix file system path to use for Unix Domain Socket.
   * @param namespace the type of the namespace that the path belongs to.
   */
  public static ServerBuilder<?> forPath(String path, Namespace namespace) {
    if (OKHTTP_SERVER_BUILDER_CLASS == null) {
      throw new UnsupportedOperationException("OkHttpChannelBuilder not found on the classpath");
    }
    try {
      // Socket address is unused, but necessary as an argument for OkHttpChannelBuilder.
      // TLS is unsupported because Conscrypt assumes the platform Socket implementation to improve
      // performance by using the file descriptor directly.
      Object o = OKHTTP_SERVER_BUILDER_CLASS
          .getMethod("forPort", SocketAddress.class, ServerCredentials.class)
          .invoke(null, (new SocketAddress() {
          }), InsecureServerCredentials.create());
      ServerBuilder<?> builder = OKHTTP_SERVER_BUILDER_CLASS.cast(o);
      OKHTTP_SERVER_BUILDER_CLASS
          .getMethod("socketFactory", ServerSocketFactory.class)
          .invoke(builder, new UdsServerSocketFactory(path, namespace));
      return builder;
    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
      throw new RuntimeException("Failed to create OkHttpServerBuilder", e);
    }
  }
}