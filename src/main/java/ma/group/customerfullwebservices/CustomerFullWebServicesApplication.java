package ma.group.customerfullwebservices;
import lombok.AllArgsConstructor;
import ma.group.customerfullwebservices.entities.Customer;
import ma.group.customerfullwebservices.repositories.CustomerRepositorie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
@AllArgsConstructor
@SpringBootApplication
public class CustomerFullWebServicesApplication {
    private CustomerRepositorie customerRepositorie;

    public static void main(String[] args) {
        SpringApplication.run(CustomerFullWebServicesApplication.class, args);
    }
    @Bean
    CommandLineRunner start(){
        return  args -> {
            List.of("oussama","yassine","mehdi").forEach(nom->{
                Customer customer=Customer.builder().nom(nom).mail(nom+"@gmail.com").build();
                customerRepositorie.save(customer);
            });
            customerRepositorie.findAll().forEach(customer->{
                System.out.println(customer.toString());
            });

        };
    }

}
