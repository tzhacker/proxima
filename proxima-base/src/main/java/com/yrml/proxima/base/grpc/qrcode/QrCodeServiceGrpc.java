package com.yrml.proxima.base.grpc.qrcode;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: QrCodeService.proto")
public final class QrCodeServiceGrpc {

  private QrCodeServiceGrpc() {}

  public static final String SERVICE_NAME = "QrCodeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.yrml.proxima.base.grpc.qrcode.QrCodeData,
      com.yrml.proxima.base.grpc.qrcode.QrCodeResponse> METHOD_EXECUTE_QR_CODE =
      io.grpc.MethodDescriptor.<com.yrml.proxima.base.grpc.qrcode.QrCodeData, com.yrml.proxima.base.grpc.qrcode.QrCodeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "QrCodeService", "ExecuteQrCode"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.yrml.proxima.base.grpc.qrcode.QrCodeData.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.yrml.proxima.base.grpc.qrcode.QrCodeResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QrCodeServiceStub newStub(io.grpc.Channel channel) {
    return new QrCodeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QrCodeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QrCodeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QrCodeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QrCodeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class QrCodeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void executeQrCode(com.yrml.proxima.base.grpc.qrcode.QrCodeData request,
        io.grpc.stub.StreamObserver<com.yrml.proxima.base.grpc.qrcode.QrCodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE_QR_CODE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_EXECUTE_QR_CODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.yrml.proxima.base.grpc.qrcode.QrCodeData,
                com.yrml.proxima.base.grpc.qrcode.QrCodeResponse>(
                  this, METHODID_EXECUTE_QR_CODE)))
          .build();
    }
  }

  /**
   */
  public static final class QrCodeServiceStub extends io.grpc.stub.AbstractStub<QrCodeServiceStub> {
    private QrCodeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QrCodeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QrCodeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QrCodeServiceStub(channel, callOptions);
    }

    /**
     */
    public void executeQrCode(com.yrml.proxima.base.grpc.qrcode.QrCodeData request,
        io.grpc.stub.StreamObserver<com.yrml.proxima.base.grpc.qrcode.QrCodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_QR_CODE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QrCodeServiceBlockingStub extends io.grpc.stub.AbstractStub<QrCodeServiceBlockingStub> {
    private QrCodeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QrCodeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QrCodeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QrCodeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yrml.proxima.base.grpc.qrcode.QrCodeResponse executeQrCode(com.yrml.proxima.base.grpc.qrcode.QrCodeData request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE_QR_CODE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QrCodeServiceFutureStub extends io.grpc.stub.AbstractStub<QrCodeServiceFutureStub> {
    private QrCodeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QrCodeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QrCodeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QrCodeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yrml.proxima.base.grpc.qrcode.QrCodeResponse> executeQrCode(
        com.yrml.proxima.base.grpc.qrcode.QrCodeData request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_QR_CODE, getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_QR_CODE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QrCodeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QrCodeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_QR_CODE:
          serviceImpl.executeQrCode((com.yrml.proxima.base.grpc.qrcode.QrCodeData) request,
              (io.grpc.stub.StreamObserver<com.yrml.proxima.base.grpc.qrcode.QrCodeResponse>) responseObserver);
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

  private static final class QrCodeServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yrml.proxima.base.grpc.qrcode.QrCodeServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QrCodeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QrCodeServiceDescriptorSupplier())
              .addMethod(METHOD_EXECUTE_QR_CODE)
              .build();
        }
      }
    }
    return result;
  }
}
