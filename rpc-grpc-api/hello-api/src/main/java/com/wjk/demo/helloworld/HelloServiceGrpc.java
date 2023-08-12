package com.wjk.demo.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *定义服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.2)",
    comments = "Source: Hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request,
      com.wjk.demo.helloworld.Hello.Response> getGetSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSum",
      requestType = com.wjk.demo.helloworld.Hello.Request.class,
      responseType = com.wjk.demo.helloworld.Hello.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request,
      com.wjk.demo.helloworld.Hello.Response> getGetSumMethod() {
    io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request, com.wjk.demo.helloworld.Hello.Response> getGetSumMethod;
    if ((getGetSumMethod = HelloServiceGrpc.getGetSumMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetSumMethod = HelloServiceGrpc.getGetSumMethod) == null) {
          HelloServiceGrpc.getGetSumMethod = getGetSumMethod =
              io.grpc.MethodDescriptor.<com.wjk.demo.helloworld.Hello.Request, com.wjk.demo.helloworld.Hello.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wjk.demo.helloworld.Hello.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wjk.demo.helloworld.Hello.Response.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("GetSum"))
              .build();
        }
      }
    }
    return getGetSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request,
      com.wjk.demo.helloworld.Hello.Response> getGetSum2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSum2",
      requestType = com.wjk.demo.helloworld.Hello.Request.class,
      responseType = com.wjk.demo.helloworld.Hello.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request,
      com.wjk.demo.helloworld.Hello.Response> getGetSum2Method() {
    io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request, com.wjk.demo.helloworld.Hello.Response> getGetSum2Method;
    if ((getGetSum2Method = HelloServiceGrpc.getGetSum2Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetSum2Method = HelloServiceGrpc.getGetSum2Method) == null) {
          HelloServiceGrpc.getGetSum2Method = getGetSum2Method =
              io.grpc.MethodDescriptor.<com.wjk.demo.helloworld.Hello.Request, com.wjk.demo.helloworld.Hello.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSum2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wjk.demo.helloworld.Hello.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wjk.demo.helloworld.Hello.Response.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("GetSum2"))
              .build();
        }
      }
    }
    return getGetSum2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request,
      com.wjk.demo.helloworld.Hello.Response> getGetSum3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSum3",
      requestType = com.wjk.demo.helloworld.Hello.Request.class,
      responseType = com.wjk.demo.helloworld.Hello.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request,
      com.wjk.demo.helloworld.Hello.Response> getGetSum3Method() {
    io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request, com.wjk.demo.helloworld.Hello.Response> getGetSum3Method;
    if ((getGetSum3Method = HelloServiceGrpc.getGetSum3Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetSum3Method = HelloServiceGrpc.getGetSum3Method) == null) {
          HelloServiceGrpc.getGetSum3Method = getGetSum3Method =
              io.grpc.MethodDescriptor.<com.wjk.demo.helloworld.Hello.Request, com.wjk.demo.helloworld.Hello.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSum3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wjk.demo.helloworld.Hello.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wjk.demo.helloworld.Hello.Response.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("GetSum3"))
              .build();
        }
      }
    }
    return getGetSum3Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request,
      com.wjk.demo.helloworld.Hello.Response> getGetSum4Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSum4",
      requestType = com.wjk.demo.helloworld.Hello.Request.class,
      responseType = com.wjk.demo.helloworld.Hello.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request,
      com.wjk.demo.helloworld.Hello.Response> getGetSum4Method() {
    io.grpc.MethodDescriptor<com.wjk.demo.helloworld.Hello.Request, com.wjk.demo.helloworld.Hello.Response> getGetSum4Method;
    if ((getGetSum4Method = HelloServiceGrpc.getGetSum4Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetSum4Method = HelloServiceGrpc.getGetSum4Method) == null) {
          HelloServiceGrpc.getGetSum4Method = getGetSum4Method =
              io.grpc.MethodDescriptor.<com.wjk.demo.helloworld.Hello.Request, com.wjk.demo.helloworld.Hello.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSum4"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wjk.demo.helloworld.Hello.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wjk.demo.helloworld.Hello.Response.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("GetSum4"))
              .build();
        }
      }
    }
    return getGetSum4Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSum(com.wjk.demo.helloworld.Hello.Request request,
        io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSumMethod(), responseObserver);
    }

    /**
     */
    public void getSum2(com.wjk.demo.helloworld.Hello.Request request,
        io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSum2Method(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Request> getSum3(
        io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetSum3Method(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Request> getSum4(
        io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetSum4Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.wjk.demo.helloworld.Hello.Request,
                com.wjk.demo.helloworld.Hello.Response>(
                  this, METHODID_GET_SUM)))
          .addMethod(
            getGetSum2Method(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.wjk.demo.helloworld.Hello.Request,
                com.wjk.demo.helloworld.Hello.Response>(
                  this, METHODID_GET_SUM2)))
          .addMethod(
            getGetSum3Method(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.wjk.demo.helloworld.Hello.Request,
                com.wjk.demo.helloworld.Hello.Response>(
                  this, METHODID_GET_SUM3)))
          .addMethod(
            getGetSum4Method(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.wjk.demo.helloworld.Hello.Request,
                com.wjk.demo.helloworld.Hello.Response>(
                  this, METHODID_GET_SUM4)))
          .build();
    }
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSum(com.wjk.demo.helloworld.Hello.Request request,
        io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSum2(com.wjk.demo.helloworld.Hello.Request request,
        io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetSum2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Request> getSum3(
        io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getGetSum3Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Request> getSum4(
        io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetSum4Method(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wjk.demo.helloworld.Hello.Response getSum(com.wjk.demo.helloworld.Hello.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.wjk.demo.helloworld.Hello.Response> getSum2(
        com.wjk.demo.helloworld.Hello.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetSum2Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *定义服务
   * </pre>
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wjk.demo.helloworld.Hello.Response> getSum(
        com.wjk.demo.helloworld.Hello.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SUM = 0;
  private static final int METHODID_GET_SUM2 = 1;
  private static final int METHODID_GET_SUM3 = 2;
  private static final int METHODID_GET_SUM4 = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SUM:
          serviceImpl.getSum((com.wjk.demo.helloworld.Hello.Request) request,
              (io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response>) responseObserver);
          break;
        case METHODID_GET_SUM2:
          serviceImpl.getSum2((com.wjk.demo.helloworld.Hello.Request) request,
              (io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SUM3:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getSum3(
              (io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response>) responseObserver);
        case METHODID_GET_SUM4:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getSum4(
              (io.grpc.stub.StreamObserver<com.wjk.demo.helloworld.Hello.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wjk.demo.helloworld.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getGetSumMethod())
              .addMethod(getGetSum2Method())
              .addMethod(getGetSum3Method())
              .addMethod(getGetSum4Method())
              .build();
        }
      }
    }
    return result;
  }
}
