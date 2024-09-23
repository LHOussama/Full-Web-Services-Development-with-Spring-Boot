package ma.group.customerfullwebservices;
import lombok.AllArgsConstructor;
import ma.group.customerfullwebservices.web.Soap;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@AllArgsConstructor
@Configuration
public class ServerSoap {
    private Bus bus;
    private Soap soap;
    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endpoint=new EndpointImpl (bus,soap);
        endpoint.publish("/CustomerServices");
        return endpoint;
    }
}
