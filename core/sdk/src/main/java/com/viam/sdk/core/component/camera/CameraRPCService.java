package com.viam.sdk.core.component.camera;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.Geometry;
import com.viam.common.v1.Common.GetGeometriesResponse;
import com.viam.common.v1.Common.ResponseMetadata;
import com.viam.component.camera.v1.Camera.GetImageRequest;
import com.viam.component.camera.v1.Camera.GetImageResponse;
import com.viam.component.camera.v1.Camera.GetImagesRequest;
import com.viam.component.camera.v1.Camera.GetImagesResponse;
import com.viam.component.camera.v1.Camera.GetPropertiesRequest;
import com.viam.component.camera.v1.Camera.GetPropertiesResponse;
import com.viam.component.camera.v1.Camera.Image;
import com.viam.component.camera.v1.CameraServiceGrpc;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRPCService;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * gRPC Service for a Camera component
 */
public class CameraRPCService extends
    CameraServiceGrpc.CameraServiceImplBase implements
    ResourceRPCService<Camera> {

  private final ResourceManager manager;

  public CameraRPCService(final ResourceManager manager) {
    this.manager = manager;
  }

  @Override
  public void doCommand(Common.DoCommandRequest request,
      StreamObserver<Common.DoCommandResponse> responseObserver) {
    final Camera camera = getResource(
        Camera.named(request.getName()));
    final Struct result = camera.doCommand(request.getCommand().getFieldsMap());
    responseObserver.onNext(Common.DoCommandResponse.newBuilder().setResult(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getGeometries(Common.GetGeometriesRequest request,
      StreamObserver<Common.GetGeometriesResponse> responseObserver) {
    final Camera camera = getResource(
        Camera.named(request.getName()));
    final List<Geometry> result = camera.getGeometries(Optional.of(request.getExtra()));
    responseObserver.onNext(GetGeometriesResponse.newBuilder().addAllGeometries(result).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getProperties(GetPropertiesRequest request,
      StreamObserver<GetPropertiesResponse> responseObserver) {
    final Camera camera = getResource(
        Camera.named(request.getName()));
    final GetPropertiesResponse result = camera.getProperties();
    responseObserver.onNext(result);
    responseObserver.onCompleted();
  }

  @Override
  public void getImage(GetImageRequest request,
      StreamObserver<GetImageResponse> responseObserver) {
    final Camera camera = getResource(
        Camera.named(request.getName()));
    final Image result = camera.getImage(Camera.mimeToFormat(request.getMimeType()),
        Optional.of(request.getExtra()));

    responseObserver.onNext(
        GetImageResponse.newBuilder().setImage(result.getImage())
            .setMimeType(Camera.formatToMime(result.getFormat())).build());
    responseObserver.onCompleted();
  }

  @Override
  public void getImages(GetImagesRequest request,
      StreamObserver<GetImagesResponse> responseObserver) {
    final Camera camera = getResource(
        Camera.named(request.getName()));
    final Entry<List<Image>, ResponseMetadata> result = camera.getImages();
    responseObserver.onNext(
        GetImagesResponse.newBuilder().addAllImages(result.getKey())
            .setResponseMetadata(result.getValue()).build());
    responseObserver.onCompleted();
  }

  @Override
  public Class<Camera> getResourceClass() {
    return Camera.class;
  }

  @Override
  public ResourceManager getManager() {
    return manager;
  }
}
