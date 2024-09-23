package ma.group.customerfullwebservices.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: protofil.proto")
public final class CustomerGrpcGrpc {

  private CustomerGrpcGrpc() {}

  public static final String SERVICE_NAME = "CustomerGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer,
      ma.group.customerfullwebservices.stub.Protofil.CustomerResponse> getGetAllCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCustomers",
      requestType = ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer.class,
      responseType = ma.group.customerfullwebservices.stub.Protofil.CustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer,
      ma.group.customerfullwebservices.stub.Protofil.CustomerResponse> getGetAllCustomersMethod() {
    io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer, ma.group.customerfullwebservices.stub.Protofil.CustomerResponse> getGetAllCustomersMethod;
    if ((getGetAllCustomersMethod = CustomerGrpcGrpc.getGetAllCustomersMethod) == null) {
      synchronized (CustomerGrpcGrpc.class) {
        if ((getGetAllCustomersMethod = CustomerGrpcGrpc.getGetAllCustomersMethod) == null) {
          CustomerGrpcGrpc.getGetAllCustomersMethod = getGetAllCustomersMethod = 
              io.grpc.MethodDescriptor.<ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer, ma.group.customerfullwebservices.stub.Protofil.CustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerGrpc", "getAllCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.group.customerfullwebservices.stub.Protofil.CustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerGrpcMethodDescriptorSupplier("getAllCustomers"))
                  .build();
          }
        }
     }
     return getGetAllCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.CustomerId,
      ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid> getGetCustomerByidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCustomerByid",
      requestType = ma.group.customerfullwebservices.stub.Protofil.CustomerId.class,
      responseType = ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.CustomerId,
      ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid> getGetCustomerByidMethod() {
    io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.CustomerId, ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid> getGetCustomerByidMethod;
    if ((getGetCustomerByidMethod = CustomerGrpcGrpc.getGetCustomerByidMethod) == null) {
      synchronized (CustomerGrpcGrpc.class) {
        if ((getGetCustomerByidMethod = CustomerGrpcGrpc.getGetCustomerByidMethod) == null) {
          CustomerGrpcGrpc.getGetCustomerByidMethod = getGetCustomerByidMethod = 
              io.grpc.MethodDescriptor.<ma.group.customerfullwebservices.stub.Protofil.CustomerId, ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerGrpc", "getCustomerByid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.group.customerfullwebservices.stub.Protofil.CustomerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerGrpcMethodDescriptorSupplier("getCustomerByid"))
                  .build();
          }
        }
     }
     return getGetCustomerByidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave,
      ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave> getAddCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCustomer",
      requestType = ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave.class,
      responseType = ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave,
      ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave> getAddCustomerMethod() {
    io.grpc.MethodDescriptor<ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave, ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave> getAddCustomerMethod;
    if ((getAddCustomerMethod = CustomerGrpcGrpc.getAddCustomerMethod) == null) {
      synchronized (CustomerGrpcGrpc.class) {
        if ((getAddCustomerMethod = CustomerGrpcGrpc.getAddCustomerMethod) == null) {
          CustomerGrpcGrpc.getAddCustomerMethod = getAddCustomerMethod = 
              io.grpc.MethodDescriptor.<ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave, ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerGrpc", "addCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerGrpcMethodDescriptorSupplier("addCustomer"))
                  .build();
          }
        }
     }
     return getAddCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerGrpcStub newStub(io.grpc.Channel channel) {
    return new CustomerGrpcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerGrpcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerGrpcFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCustomers(ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer request,
        io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCustomersMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerByid(ma.group.customerfullwebservices.stub.Protofil.CustomerId request,
        io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerByidMethod(), responseObserver);
    }

    /**
     */
    public void addCustomer(ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave request,
        io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer,
                ma.group.customerfullwebservices.stub.Protofil.CustomerResponse>(
                  this, METHODID_GET_ALL_CUSTOMERS)))
          .addMethod(
            getGetCustomerByidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.group.customerfullwebservices.stub.Protofil.CustomerId,
                ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid>(
                  this, METHODID_GET_CUSTOMER_BYID)))
          .addMethod(
            getAddCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave,
                ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave>(
                  this, METHODID_ADD_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerGrpcStub extends io.grpc.stub.AbstractStub<CustomerGrpcStub> {
    private CustomerGrpcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGrpcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGrpcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGrpcStub(channel, callOptions);
    }

    /**
     */
    public void getAllCustomers(ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer request,
        io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerByid(ma.group.customerfullwebservices.stub.Protofil.CustomerId request,
        io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerByidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCustomer(ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave request,
        io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerGrpcBlockingStub extends io.grpc.stub.AbstractStub<CustomerGrpcBlockingStub> {
    private CustomerGrpcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGrpcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGrpcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.group.customerfullwebservices.stub.Protofil.CustomerResponse getAllCustomers(ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid getCustomerByid(ma.group.customerfullwebservices.stub.Protofil.CustomerId request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerByidMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave addCustomer(ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave request) {
      return blockingUnaryCall(
          getChannel(), getAddCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerGrpcFutureStub extends io.grpc.stub.AbstractStub<CustomerGrpcFutureStub> {
    private CustomerGrpcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGrpcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGrpcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.group.customerfullwebservices.stub.Protofil.CustomerResponse> getAllCustomers(
        ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid> getCustomerByid(
        ma.group.customerfullwebservices.stub.Protofil.CustomerId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerByidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave> addCustomer(
        ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CUSTOMERS = 0;
  private static final int METHODID_GET_CUSTOMER_BYID = 1;
  private static final int METHODID_ADD_CUSTOMER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CUSTOMERS:
          serviceImpl.getAllCustomers((ma.group.customerfullwebservices.stub.Protofil.GetAllCustomer) request,
              (io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_BYID:
          serviceImpl.getCustomerByid((ma.group.customerfullwebservices.stub.Protofil.CustomerId) request,
              (io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponseByid>) responseObserver);
          break;
        case METHODID_ADD_CUSTOMER:
          serviceImpl.addCustomer((ma.group.customerfullwebservices.stub.Protofil.CustomerRequestSave) request,
              (io.grpc.stub.StreamObserver<ma.group.customerfullwebservices.stub.Protofil.CustomerResponsesave>) responseObserver);
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

  private static abstract class CustomerGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.group.customerfullwebservices.stub.Protofil.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerGrpc");
    }
  }

  private static final class CustomerGrpcFileDescriptorSupplier
      extends CustomerGrpcBaseDescriptorSupplier {
    CustomerGrpcFileDescriptorSupplier() {}
  }

  private static final class CustomerGrpcMethodDescriptorSupplier
      extends CustomerGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerGrpcFileDescriptorSupplier())
              .addMethod(getGetAllCustomersMethod())
              .addMethod(getGetCustomerByidMethod())
              .addMethod(getAddCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
