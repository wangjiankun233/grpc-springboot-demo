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

    @Override
    public void getSum2(Hello.Request request, StreamObserver<Hello.Response> responseObserver) {
        for(int i=0;i<10;i++){
            try {
                responseObserver.onNext(Hello.Response.newBuilder().setResult(request.getNum1()+request.getNum2()+i).build());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Hello.Request> getSum3(final StreamObserver<Hello.Response> responseObserver) {
        return new StreamObserver<Hello.Request>() {

            private int result = 0;
            public void onNext(Hello.Request request) {
                result+=request.getNum2()+request.getNum1();
            }

            public void onError(Throwable throwable) {

            }

            public void onCompleted() {
                responseObserver.onNext(Hello.Response.newBuilder().setResult(result).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Hello.Request> getSum4(final StreamObserver<Hello.Response> responseObserver) {
        return new StreamObserver<Hello.Request>() {

            public void onNext(Hello.Request request) {
                responseObserver.onNext(Hello.Response.newBuilder().setResult(request.getNum1()+request.getNum2()).build());
            }

            public void onError(Throwable throwable) {

            }

            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
