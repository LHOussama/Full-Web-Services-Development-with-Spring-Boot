package ma.group.customerfullwebservices.Mapper;
import lombok.AllArgsConstructor;
import ma.group.customerfullwebservices.dto.CustomerDto;
import ma.group.customerfullwebservices.entities.Customer;
import ma.group.customerfullwebservices.stub.Protofil;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component

public class CustomerMapper {
    private final ModelMapper modelMapper=new ModelMapper();
    public  Customer fromCustomerDto(CustomerDto customerDto){
        return modelMapper.map(customerDto,Customer.class);
    }
    public Protofil.Customer fromCustomer(Customer customer){return modelMapper.map(customer,Protofil.Customer.Builder.class).build();}
    public Customer fromCustomerRequestGrpc(Protofil.CustomerRequest request){return modelMapper.map(request,Customer.class);}
}
