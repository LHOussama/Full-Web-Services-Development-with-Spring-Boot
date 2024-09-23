package ma.group.customerfullwebservices.repositories;
import ma.group.customerfullwebservices.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepositorie extends  JpaRepository<Customer,Long> {

}
