package com.viam.sdk.core.component.camera;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.viam.common.v1.Common;
import com.viam.common.v1.Common.GetGeometriesRequest;
import com.viam.common.v1.Common.ResponseMetadata;
import com.viam.component.camera.v1.Camera.Format;
import com.viam.component.camera.v1.Camera.GetImageRequest;
import com.viam.component.camera.v1.Camera.GetImageResponse;
import com.viam.component.camera.v1.Camera.GetImagesRequest;
import com.viam.component.camera.v1.Camera.GetImagesResponse;
import com.viam.component.camera.v1.Camera.GetPropertiesRequest;
import com.viam.component.camera.v1.Camera.GetPropertiesResponse;
import com.viam.component.camera.v1.Camera.Image;
import com.viam.component.camera.v1.CameraServiceGrpc;
import com.viam.sdk.core.rpc.Channel;
import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * gRPC Client for a Camera component
 */
public class CameraRPCClient extends com.viam.sdk.core.component.camera.Camera {

  private final CameraServiceGrpc.CameraServiceBlockingStub client;

  public CameraRPCClient(final String name, final Channel chan) {
    super(name);
    final CameraServiceGrpc.CameraServiceBlockingStub client = CameraServiceGrpc.newBlockingStub(
        chan);
    if (chan.getCallCredentials().isPresent()) {
      this.client = client.withCallCredentials(chan.getCallCredentials().get());
    } else {
      this.client = client;
    }
  }

  @Override
  public Struct doCommand(final Map<String, Value> command) {
    return client.doCommand(Common.DoCommandRequest.newBuilder().
        setName(getName().getName()).
        setCommand(Struct.newBuilder().putAllFields(command).build()).
        build()).getResult();
  }

  @Override
  public List<Common.Geometry> getGeometries(final Optional<Struct> extra) {
    final GetGeometriesRequest.Builder builder = Common.GetGeometriesRequest.newBuilder().
        setName(getName().getName());
    extra.ifPresent(builder::setExtra);
    return client.getGeometries(builder.build()).getGeometriesList();
  }

  @Override
  protected GetPropertiesResponse getProperties() {
    final GetPropertiesRequest.Builder builder = GetPropertiesRequest.newBuilder().
        setName(getName().getName());
    return client.getProperties(builder.build());
  }

  @Override
  public Image getImage(final Format format,
      Optional<Struct> extra) {
    final GetImageRequest.Builder builder = GetImageRequest.newBuilder().
        setName(getName().getName()).
        setMimeType(Camera.formatToMime(format));
    extra.ifPresent(builder::setExtra);
    final GetImageResponse resp = client.getImage(builder.build());
    final Image.Builder imgBuilder = Image.newBuilder().
        setSourceName(getName().getName()).
        setImage(resp.getImage());

    return imgBuilder.setFormat(Camera.mimeToFormat(resp.getMimeType())).build();
  }

  @Override
  public Entry<List<Image>, ResponseMetadata> getImages() {
    final GetImagesRequest.Builder builder = GetImagesRequest.newBuilder().
        setName(getName().getName());
    final GetImagesResponse resp = client.getImages(builder.build());
    return new SimpleEntry<>(resp.getImagesList(), resp.getResponseMetadata());
  }
}
