package com.example;

import com.example.grpc.GreetingSericeGrpc;
import com.example.grpc.GreetingService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext()
                .build();
        GreetingSericeGrpc.GreetingSericeBlockingStub stub = GreetingSericeGrpc.newBlockingStub(channel);
        GreetingService.HelloRequest request = GreetingService.HelloRequest.newBuilder()
                .setName("Valera")
                .build();
        GreetingService.HelloResponse response = stub.greeting(request);
        System.out.println(response);
        channel.shutdownNow();
    }
}
