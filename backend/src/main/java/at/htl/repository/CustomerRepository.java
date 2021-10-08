package at.htl.repository;

import at.htl.entity.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerRepository implements PanacheRepositoryBase {

}
