package ma.group.customerfullwebservices.web;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import ma.group.customerfullwebservices.Mapper.CustomerMapper;
import ma.group.customerfullwebservices.entities.Customer;
import ma.group.customerfullwebservices.repositories.CustomerRepositorie;
import ma.group.customerfullwebservices.stub.CustomerGrpcGrpc;
import ma.group.customerfullwebservices.stub.Protofil;
import net.devh.boot.grpc.server.service.GrpcService;
import java.util.List;
@GrpcService
@AllArgsConstructor
public class Grpc extends CustomerGrpcGrpc.CustomerGrpcImplBase{
    private CustomerRepositorie customerRepositorie;
    private CustomerMapper customerMapper;
    @Override
    public void getAllCustomers(Protofil.GetAllCustomer request, StreamObserver<Protofil.CustomerResponse> responseObserver) {
        List<Customer> customers=customerRepositorie.findAll();
        customers.forEach(customer -> System.out.println(customer.toString()));
        List<Protofil.Customer> collect = customers.stream().map(customer -> customerMapper.fromCustomer(customer)).toList();
        Protofil.CustomerResponse response= Protofil.CustomerResponse.newBuilder().addAllCustomers(collect).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        super.getAllCustomers(request, responseObserver);
    }

    @Override
    public void getCustomerByid(Protofil.CustomerId request, StreamObserver<Protofil.CustomerResponseByid> responseObserver) {
        Customer customer=customerRepositorie.findById(request.getId()).orElse(null);
        Protofil.Customer customer1=customerMapper.fromCustomer(customer);
        Protofil.CustomerResponseByid customerResponseByid=Protofil.CustomerResponseByid.newBuilder().setCustomer(customer1).build();
        responseObserver.onNext(customerResponseByid);
        responseObserver.onCompleted();
        super.getCustomerByid(request, responseObserver);
    }


    @Override
    public void addCustomer(Protofil.CustomerRequestSave request, StreamObserver<Protofil.CustomerResponsesave> responseObserver) {
        Protofil.CustomerRequest request1=request.getCustomerRequest();
        Customer customer=customerMapper.fromCustomerRequestGrpc(request1);
        Customer customerSaved=customerRepositorie.save(customer);
        Protofil.CustomerResponsesave customerResponsesave= Protofil.CustomerResponsesave.newBuilder().setCustomer(customerMapper.fromCustomer(customerSaved)).build();
        responseObserver.onNext(customerResponsesave);
        responseObserver.onCompleted();
        super.addCustomer(request, responseObserver);
    }
}
