package com.wjk.demo.controller;

import com.wjk.demo.helloworld.Hello;
import com.wjk.demo.helloworld.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GrpcClient("server1")
    HelloServiceGrpc.HelloServiceBlockingStub helloService;
    @GetMapping("hello")
    public double hello(){
        Hello.Response sum = helloService.getSum(Hello.Request.newBuilder().setNum1(10).setNum2(20).build());
        return sum.getResult();
    }
}
