package at.htl.repository;

import at.htl.entity.Plant;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class PlantRepository implements PanacheRepositoryBase<Plant,Long> {

    @Transactional
    public void save(Plant plant){
        getEntityManager().persist(plant);
    }

}
