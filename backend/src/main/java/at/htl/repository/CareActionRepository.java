package at.htl.repository;

import at.htl.entity.CareAction;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CareActionRepository implements PanacheRepositoryBase<CareAction, Long> {
}
