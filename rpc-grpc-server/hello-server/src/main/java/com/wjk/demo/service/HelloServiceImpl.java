package com.wjk.demo.service;

import com.wjk.demo.helloworld.Hello;
import com.wjk.demo.helloworld.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void getSum(Hello.Request request, StreamObserver<Hello.Response> responseObserver) {
        responseObserver.onNext(Hello.Response.newBuilder().setResult(request.getNum1()+request.getNum2()).build());
        responseObserver.onCompleted();
    }
}
