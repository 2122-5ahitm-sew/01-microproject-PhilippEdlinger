package at.htl.boundary;

import at.htl.repository.CustomerRepository;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path(("customer"))
public class CustomerResource {

    @Inject
    CustomerRepository customerRepository;

    @Inject
    Logger logger;

    @GET
    public Response getAllCustomer (){
            return Response
                    .accepted(customerRepository.findAll())
                    .build();
    }
}
