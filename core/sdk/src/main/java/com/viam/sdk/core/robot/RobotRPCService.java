package com.viam.sdk.core.robot;

import com.google.protobuf.Struct;
import com.viam.common.v1.Common.ResourceName;
import com.viam.robot.v1.Robot.GetStatusRequest;
import com.viam.robot.v1.Robot.GetStatusResponse;
import com.viam.robot.v1.Robot.ResourceNamesRequest;
import com.viam.robot.v1.Robot.ResourceNamesResponse;
import com.viam.robot.v1.Robot.ResourceRPCSubtype;
import com.viam.robot.v1.Robot.ResourceRPCSubtypesRequest;
import com.viam.robot.v1.Robot.ResourceRPCSubtypesResponse;
import com.viam.robot.v1.Robot.Status;
import com.viam.robot.v1.Robot.StopAllRequest;
import com.viam.robot.v1.Robot.StopAllResponse;
import com.viam.robot.v1.Robot.StopExtraParameters;
import com.viam.robot.v1.Robot.StreamStatusRequest;
import com.viam.robot.v1.Robot.StreamStatusResponse;
import com.viam.robot.v1.RobotServiceGrpc.RobotServiceImplBase;
import com.viam.sdk.core.component.movementsensor.MovementSensor;
import com.viam.sdk.core.component.sensor.Sensor;
import com.viam.sdk.core.exception.ResourceNotFoundException;
import com.viam.sdk.core.resource.Registry;
import com.viam.sdk.core.resource.Resource;
import com.viam.sdk.core.resource.Resource.Stoppable;
import com.viam.sdk.core.resource.ResourceManager;
import com.viam.sdk.core.resource.ResourceRegistration;
import com.viam.sdk.core.resource.Subtype;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class RobotRPCService extends RobotServiceImplBase {

  private final ResourceManager manager;

  public RobotRPCService(final ResourceManager manager) {
    this.manager = manager;
  }

  @Override
  public void resourceNames(
      final ResourceNamesRequest request,
      final StreamObserver<ResourceNamesResponse> responseObserver
  ) {
    responseObserver.onNext(ResourceNamesResponse.newBuilder()
        .addAllResources(manager.resourceNames().stream()
            // If the resource is a MovementSensor, DO NOT include Sensor as well
            // (it will get added via MovementSensor)
            .filter(name -> !(name.getSubtype().equals(Sensor.SUBTYPE.getResourceSubtype())
                && manager.isManaging(MovementSensor.named(name.getName()))))
            .collect(Collectors.toList()))
        .build());
    responseObserver.onCompleted();
  }

  @Override
  public void resourceRPCSubtypes(
      final ResourceRPCSubtypesRequest request,
      final StreamObserver<ResourceRPCSubtypesResponse> responseObserver
  ) {
    final ResourceRPCSubtypesResponse.Builder builder = ResourceRPCSubtypesResponse.newBuilder();
    for (final Entry<Subtype, ResourceRegistration<?>> entry : Registry.registeredSubtypes()
        .entrySet()) {
      final Subtype subtype = entry.getKey();
      builder.addResourceRpcSubtypes(
          ResourceRPCSubtype.newBuilder()
              .setProtoService(entry.getValue().getProtoServiceName())
              .setSubtype(ResourceName.newBuilder()
                  .setNamespace(subtype.getNamespace())
                  .setType(subtype.getResourceType())
                  .setSubtype(subtype.getResourceSubtype())
                  .build()));
    }
    responseObserver.onNext(builder.build());
    responseObserver.onCompleted();
  }

  private List<Status> generateStatuses(Collection<ResourceName> resourceNames) {
    final List<Status> statuses = new ArrayList<>();
    final Set<ResourceName> seenNames = new HashSet<>();

    if (resourceNames.isEmpty()) {
      if (manager.resourceNames().isEmpty()) {
        return statuses;
      }
      return generateStatuses(manager.resourceNames());
    }

    for (final ResourceName name : resourceNames) {
      final Resource res;
      try {
        res = manager.getResource(Resource.class, name);
      } catch (final ResourceNotFoundException ignored) {
        continue;
      }

      final Status status = res.createStatus();
      if (seenNames.contains(status.getName())) {
        continue;
      }
      seenNames.add(status.getName());
      statuses.add(status);
    }
    return statuses;
  }

  @Override
  public void getStatus(
      final GetStatusRequest request,
      final StreamObserver<GetStatusResponse> responseObserver
  ) {
    responseObserver.onNext(GetStatusResponse.newBuilder()
        .addAllStatus(generateStatuses(request.getResourceNamesList())).build());
    responseObserver.onCompleted();
  }

  @Override
  public void streamStatus(
      final StreamStatusRequest request,
      final StreamObserver<StreamStatusResponse> responseObserver
  ) {
    while (true) {
      // TODO: is this okay to sleep in thread?
      try {
        Thread.sleep(request.getEvery().getSeconds() * 1000, request.getEvery().getNanos());
      } catch (InterruptedException e) {
        responseObserver.onError(e);
        return;
      }
      responseObserver.onNext(StreamStatusResponse.newBuilder()
          .addAllStatus(generateStatuses(request.getResourceNamesList())).build());
    }
  }

  @Override
  public void stopAll(StopAllRequest request, StreamObserver<StopAllResponse> responseObserver) {
    final List<String> failed = new ArrayList<>();
    final Map<ResourceName, Struct> extras = new HashMap<>();
    for (final StopExtraParameters extra : request.getExtraList()) {
      extras.put(extra.getName(), extra.getParams());
    }

    for (final ResourceName name : manager.resourceNames()) {
      final Resource res;
      try {
        res = manager.getResource(Resource.class, name);
      } catch (final ResourceNotFoundException ignored) {
        continue;
      }

      if (res instanceof Stoppable) {
        try {
          ((Stoppable) res).stop(Optional.ofNullable(extras.get(res.getName())));
        } catch (final Throwable t) {
          failed.add(name.getName());
        }
      }
    }

    if (failed.isEmpty()) {
      responseObserver.onCompleted();
      return;
    }
    responseObserver.onError(
        io.grpc.Status.UNIMPLEMENTED.withDescription(
            String.format("failed to stop resources named: %s",
                String.join(",", failed))).asException());
  }
}
