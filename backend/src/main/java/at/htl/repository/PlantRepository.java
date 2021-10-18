package at.htl.repository;

import at.htl.entity.Plant;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PlantRepository implements PanacheRepositoryBase<Plant,Long> {
}
