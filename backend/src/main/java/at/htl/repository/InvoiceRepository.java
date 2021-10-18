package at.htl.repository;

import at.htl.entity.Invoice;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InvoiceRepository implements PanacheRepositoryBase<Invoice,Long> {
}
