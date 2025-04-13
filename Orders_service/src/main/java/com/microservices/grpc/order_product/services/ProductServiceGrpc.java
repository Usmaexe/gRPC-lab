package com.microservices.grpc.order_product.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "order_product.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.order_product.dto.GetProductByIdRequest,
      com.microservices.grpc.order_product.dto.GetProductByIdResponse> getGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductById",
      requestType = com.microservices.grpc.order_product.dto.GetProductByIdRequest.class,
      responseType = com.microservices.grpc.order_product.dto.GetProductByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.order_product.dto.GetProductByIdRequest,
      com.microservices.grpc.order_product.dto.GetProductByIdResponse> getGetProductByIdMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.order_product.dto.GetProductByIdRequest, com.microservices.grpc.order_product.dto.GetProductByIdResponse> getGetProductByIdMethod;
    if ((getGetProductByIdMethod = ProductServiceGrpc.getGetProductByIdMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductByIdMethod = ProductServiceGrpc.getGetProductByIdMethod) == null) {
          ProductServiceGrpc.getGetProductByIdMethod = getGetProductByIdMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.order_product.dto.GetProductByIdRequest, com.microservices.grpc.order_product.dto.GetProductByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order_product.dto.GetProductByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order_product.dto.GetProductByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductById"))
              .build();
        }
      }
    }
    return getGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservices.grpc.order_product.dto.UpdateProductRequest,
      com.microservices.grpc.order_product.dto.UpdateProductResponse> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = com.microservices.grpc.order_product.dto.UpdateProductRequest.class,
      responseType = com.microservices.grpc.order_product.dto.UpdateProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservices.grpc.order_product.dto.UpdateProductRequest,
      com.microservices.grpc.order_product.dto.UpdateProductResponse> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.microservices.grpc.order_product.dto.UpdateProductRequest, com.microservices.grpc.order_product.dto.UpdateProductResponse> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
          ProductServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<com.microservices.grpc.order_product.dto.UpdateProductRequest, com.microservices.grpc.order_product.dto.UpdateProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order_product.dto.UpdateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservices.grpc.order_product.dto.UpdateProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProductServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProductServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProductServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getProductById(com.microservices.grpc.order_product.dto.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order_product.dto.GetProductByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateProduct(com.microservices.grpc.order_product.dto.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order_product.dto.UpdateProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductService.
   */
  public static abstract class ProductServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProductById(com.microservices.grpc.order_product.dto.GetProductByIdRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order_product.dto.GetProductByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.microservices.grpc.order_product.dto.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.microservices.grpc.order_product.dto.UpdateProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingV2Stub> {
    private ProductServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.microservices.grpc.order_product.dto.GetProductByIdResponse getProductById(com.microservices.grpc.order_product.dto.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.order_product.dto.UpdateProductResponse updateProduct(com.microservices.grpc.order_product.dto.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.microservices.grpc.order_product.dto.GetProductByIdResponse getProductById(com.microservices.grpc.order_product.dto.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservices.grpc.order_product.dto.UpdateProductResponse updateProduct(com.microservices.grpc.order_product.dto.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductService.
   */
  public static final class ProductServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.order_product.dto.GetProductByIdResponse> getProductById(
        com.microservices.grpc.order_product.dto.GetProductByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservices.grpc.order_product.dto.UpdateProductResponse> updateProduct(
        com.microservices.grpc.order_product.dto.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_BY_ID = 0;
  private static final int METHODID_UPDATE_PRODUCT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((com.microservices.grpc.order_product.dto.GetProductByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.order_product.dto.GetProductByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.microservices.grpc.order_product.dto.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.microservices.grpc.order_product.dto.UpdateProductResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetProductByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.order_product.dto.GetProductByIdRequest,
              com.microservices.grpc.order_product.dto.GetProductByIdResponse>(
                service, METHODID_GET_PRODUCT_BY_ID)))
        .addMethod(
          getUpdateProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservices.grpc.order_product.dto.UpdateProductRequest,
              com.microservices.grpc.order_product.dto.UpdateProductResponse>(
                service, METHODID_UPDATE_PRODUCT)))
        .build();
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.microservices.grpc.order_product.services.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetProductByIdMethod())
              .addMethod(getUpdateProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
