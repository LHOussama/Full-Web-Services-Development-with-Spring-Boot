package ma.group.customerfullwebservices.web;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.group.customerfullwebservices.Mapper.CustomerMapper;
import ma.group.customerfullwebservices.dto.CustomerDto;
import ma.group.customerfullwebservices.entities.Customer;
import ma.group.customerfullwebservices.repositories.CustomerRepositorie;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
@AllArgsConstructor
@WebService(serviceName = "CustomerSoapService")
public class Soap {
    private CustomerMapper customerMapper;
    private CustomerRepositorie customerRepositorie;
    @WebMethod(operationName = "getCustomers")
    public List<Customer> getAllCustomers(){
        return customerRepositorie.findAll();
    }
    @WebMethod
    public Customer getById(@WebParam long id){
        return customerRepositorie.findById(id).orElse(null);
    }
    @WebMethod
    public Customer addCustomer(CustomerDto customerDto){
        return customerRepositorie.save(customerMapper.fromCustomerDto(customerDto));
    }
}
