package com.wjk.demo.controller;

import com.wjk.demo.helloworld.Hello;
import com.wjk.demo.helloworld.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GrpcClient("server1")
    HelloServiceGrpc.HelloServiceBlockingStub helloService;

    @GrpcClient("server1")
    HelloServiceGrpc.HelloServiceStub helloServiceStub;


    @GetMapping("hello")
    public double hello(){
        Hello.Response sum = helloService.getSum(Hello.Request.newBuilder().setNum1(10).setNum2(20).build());
        return sum.getResult();
    }

    @GetMapping(value = "hello2",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> hello2() throws IOException {
        return Flux.create(emitter -> {
            helloServiceStub.getSum2(Hello.Request.newBuilder().setNum1(11).setNum2(12).build(), new StreamObserver<Hello.Response>() {
                int result = 0;
                public void onNext(Hello.Response response) {
                    result+=response.getResult();
                    System.out.println(result);
                    emitter.next(String.valueOf(result));
                }

                public void onError(Throwable throwable) {

                }
                public void onCompleted() {
                    System.out.println("完成");
                    emitter.next("completed");
                    emitter.complete();
                }
            });
        });
    }

    @GetMapping(value = "hello3",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> hello3() throws IOException {
        return Flux.create(emitter -> {
            StreamObserver<Hello.Request> requestStreamObserver = helloServiceStub.getSum3(new StreamObserver<Hello.Response>() {
                @Override
                public void onNext(Hello.Response response) {
                    double result = response.getResult();

                    emitter.next(String.valueOf(result));
                }

                @Override
                public void onError(Throwable throwable) {

                }

                @Override
                public void onCompleted() {
                    emitter.complete();
                }
            });

            for (int i = 0;i<10;i++){
                requestStreamObserver.onNext(Hello.Request.newBuilder().setNum2(i).setNum2(i+1).build());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            requestStreamObserver.onCompleted();
        });
    }
    @GetMapping(value = "hello4",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> hello4() throws IOException {
        return Flux.create(emitter -> {
            StreamObserver<Hello.Request> requestStreamObserver = helloServiceStub.getSum4(new StreamObserver<Hello.Response>() {
                @Override
                public void onNext(Hello.Response response) {
                    double result = response.getResult();
                    System.out.println(result);
                    emitter.next(String.valueOf(result));
                }

                @Override
                public void onError(Throwable throwable) {

                }

                @Override
                public void onCompleted() {
                    emitter.complete();
                }
            });
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0;i<10;i++){
                        requestStreamObserver.onNext(Hello.Request.newBuilder().setNum2(i).setNum2(i+1).build());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    requestStreamObserver.onCompleted();
                }
            });
            thread.start();
        });
    }
}
