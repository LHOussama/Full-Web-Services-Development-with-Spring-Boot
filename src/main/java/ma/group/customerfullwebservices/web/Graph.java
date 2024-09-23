package ma.group.customerfullwebservices.web;
import lombok.AllArgsConstructor;
import ma.group.customerfullwebservices.Mapper.CustomerMapper;
import ma.group.customerfullwebservices.dto.CustomerDto;
import ma.group.customerfullwebservices.entities.Customer;
import ma.group.customerfullwebservices.repositories.CustomerRepositorie;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
@Controller
@AllArgsConstructor
public class Graph {
    private CustomerMapper customerMapper;
    private CustomerRepositorie customerRepositorie;
    @QueryMapping
    public List<Customer> getCustomers(){
        return customerRepositorie.findAll();
    }
    @QueryMapping
    public Customer getCustomerById(@Argument Long id){
        Customer customer=customerRepositorie.findById(id).orElse(null);
        if(customer==null)
            throw  new RuntimeException(String.format("Customer not Found "+id));
        return customer;
    }
    @MutationMapping
    public Customer addCustomer(@Argument CustomerDto customer){
        return customerRepositorie.save(customerMapper.fromCustomerDto(customer));
    }
}
