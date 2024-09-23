package ma.group.customerfullwebservices.web;
import lombok.AllArgsConstructor;
import ma.group.customerfullwebservices.entities.Customer;
import ma.group.customerfullwebservices.repositories.CustomerRepositorie;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
public class Rest {
    private CustomerRepositorie customerRepositorie;

    @GetMapping("/customers")
    public List<Customer> customerList(){
        return customerRepositorie.findAll();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerRepositorie.save(customer);
    }

    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable long id){
        return customerRepositorie.findById(id).orElseThrow();
    }
}
