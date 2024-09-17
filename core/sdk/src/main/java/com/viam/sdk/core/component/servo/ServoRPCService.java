package com.viam.sdk.core.component.servo;
 import com.google.protobuf.Struct;
 import com.viam.common.v1.Common;
 import com.viam.component.servo.v1.ServoServiceGrpc;
 import com.viam.sdk.core.resource.ResourceRPCService;
 import com.viam.sdk.core.resource.ResourceManager;
 import io.grpc.stub.StreamObserver;

 import java.util.List;
 import java.util.Optional;


public class ServoRPCService extends ServoServiceGrpc.ServoServiceImplBase implements ResourceRPCService<Servo> {

    private final ResourceManager manager;
    public ServoRPCService(ResourceManager manager) { this.manager = manager; }
    @Override
    public Class<Servo> getResourceClass() {
        return Servo.class;
    }

    @Override
    public ResourceManager getManager() {
        return manager;
    }

    @Override
    public void move(com.viam.component.servo.v1.Servo.MoveRequest request, StreamObserver<com.viam.component.servo.v1.Servo.MoveResponse> responseObserver) {
        Servo servo = getResource(Servo.named(request.getName()));
        servo.move(request.getAngleDeg(), request.getExtra());
        responseObserver.onNext(com.viam.component.servo.v1.Servo.MoveResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void stop(com.viam.component.servo.v1.Servo.StopRequest request, StreamObserver<com.viam.component.servo.v1.Servo.StopResponse> responseObserver) {
        Servo servo = getResource(Servo.named(request.getName()));
        servo.stop();
        responseObserver.onNext(com.viam.component.servo.v1.Servo.StopResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void getPosition(com.viam.component.servo.v1.Servo.GetPositionRequest request, StreamObserver<com.viam.component.servo.v1.Servo.GetPositionResponse> responseObserver) {
        Servo servo = getResource(Servo.named(request.getName()));
        int position = servo.getPosition(request.getExtra());
        responseObserver.onNext(com.viam.component.servo.v1.Servo.GetPositionResponse.newBuilder().setPositionDeg(position).build());
        responseObserver.onCompleted();
    }

    @Override
    public void isMoving(com.viam.component.servo.v1.Servo.IsMovingRequest request, StreamObserver<com.viam.component.servo.v1.Servo.IsMovingResponse> responseObserver) {
        Servo servo = getResource(Servo.named(request.getName()));
        boolean isMoving = servo.isMoving();
        responseObserver.onNext(com.viam.component.servo.v1.Servo.IsMovingResponse.newBuilder().setIsMoving(isMoving).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getGeometries(com.viam.common.v1.Common.GetGeometriesRequest request,
                     StreamObserver<com.viam.common.v1.Common.GetGeometriesResponse> responseObserver){
        Servo servo = getResource(Servo.named(request.getName()));
        List<Common.Geometry> geometries = servo.getGeometries(Optional.ofNullable(request.getExtra()));
        responseObserver.onNext(Common.GetGeometriesResponse.newBuilder().addAllGeometries(geometries).build());
        responseObserver.onCompleted();
    }
    @Override
    public void doCommand(Common.DoCommandRequest request,
                          StreamObserver<Common.DoCommandResponse> responseObserver) {

        Servo servo = getResource(Servo.named(request.getName()));
        Struct result = servo.doCommand(request.getCommand().getFieldsMap());
        responseObserver.onNext(Common.DoCommandResponse.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }
}
