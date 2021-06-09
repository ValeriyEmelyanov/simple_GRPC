package com.example;

import com.example.grpc.GreetingSericeGrpc;
import com.example.grpc.GreetingService;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingSericeGrpc.GreetingSericeImplBase {
    public void greeting(GreetingService.HelloRequest request,
                         StreamObserver<GreetingService.HelloResponse> responseObserver) {
        System.out.println(request);

        GreetingService.HelloResponse response = GreetingService.HelloResponse.newBuilder()
                .setGreeting("Hello from server, " + request.getName())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }
}
