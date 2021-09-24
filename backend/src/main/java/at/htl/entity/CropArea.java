package at.htl.entity;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Objects;

@Entity
public class CropArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private HashMap< Integer, Plant > cropSubdivision = new HashMap<Integer, Plant>();

    public CropArea() {
    }

    public CropArea(Long id, HashMap<Integer, Plant> cropSubdivision) {
        this.id = id;
        this.cropSubdivision = cropSubdivision;
    }

    //region Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HashMap<Integer, Plant> getCropSubdivision() {
        return cropSubdivision;
    }

    public void setCropSubdivision(HashMap<Integer, Plant> cropSubdivision) {
        this.cropSubdivision = cropSubdivision;
    }
    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CropArea)) return false;
        CropArea cropArea = (CropArea) o;
        return Objects.equals(id, cropArea.id) && Objects.equals(cropSubdivision, cropArea.cropSubdivision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cropSubdivision);
    }
}
