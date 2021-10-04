package at.htl.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String plantName;
    private PlantType plantType;
    @ManyToOne
    private CareAction maintenance;

    public Plant() {
    }

    public Plant(Long id, String plantName, PlantType plantType, CareAction maintenance) {
        this.id = id;
        this.plantName = plantName;
        this.plantType = plantType;
        this.maintenance = maintenance;
    }

    //region Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }
    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return Objects.equals(id, plant.id) && Objects.equals(plantName, plant.plantName) && plantType == plant.plantType && Objects.equals(maintenance, plant.maintenance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plantName, plantType, maintenance);
    }
}
