package at.htl.boundary;

import at.htl.entity.Customer;
import at.htl.repository.CustomerRepository;
import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.Form;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
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

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createCustomer(
            @FormParam("firstName") String firstName,
            @FormParam("lastName") String lastName
    ){

        Customer customer = new Customer();
        customer.firstName = firstName;
        customer.lastName = lastName;

        return Response
                .status(Response.Status.CREATED)
                .entity(customer)
                .build();
    }
}
