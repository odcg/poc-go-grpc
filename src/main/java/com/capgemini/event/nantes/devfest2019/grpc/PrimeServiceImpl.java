package com.capgemini.event.nantes.devfest2019.grpc;

import io.grpc.BindableService;
import io.grpc.ServerServiceDefinition;
import om.capgemini.event.nantes.devfest2019.grpc.PrimeRequest;
import om.capgemini.event.nantes.devfest2019.grpc.PrimeResponse;

import io.grpc.stub.StreamObserver;

public class PrimeServiceImpl implements BindableService {


    public void prime(
            PrimeRequest request, StreamObserver<PrimeResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
                .append(request.getMax())
                .toString();

        PrimeResponse response = PrimeResponse.newBuilder()
                .setPrimeList(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public ServerServiceDefinition bindService() {
        return null;
    }
}