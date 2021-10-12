package at.htl.entity;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;
import java.util.Objects;

@Entity
public class CropArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonbProperty("crop_area_id")
    private Long id;
    @ManyToOne
    private Plant plant;

    public CropArea() {
    }

    public CropArea(Long id, Plant plant) {
        this.id = id;
        this.plant = plant;
    }

    //region Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    //endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CropArea)) return false;
        CropArea cropArea = (CropArea) o;
        return Objects.equals(id, cropArea.id) && Objects.equals(plant, cropArea.plant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plant);
    }
}
