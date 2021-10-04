package at.htl.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CareAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String maintenanceName;
    private double amountOfCarePerWeek;

    public CareAction() {
    }

    public CareAction(Long id, String maintenanceName, double amountOfCarePerWeek) {
        this.id = id;
        this.maintenanceName = maintenanceName;
        this.amountOfCarePerWeek = amountOfCarePerWeek;
    }

    //region Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaintenanceName() {
        return maintenanceName;
    }

    public void setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName;
    }

    public double getAmountOfCarePerWeek() {
        return amountOfCarePerWeek;
    }

    public void setAmountOfCarePerWeek(double amountOfCarePerWeek) {
        this.amountOfCarePerWeek = amountOfCarePerWeek;
    }

    //endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CareAction)) return false;
        CareAction that = (CareAction) o;
        return Double.compare(that.amountOfCarePerWeek, amountOfCarePerWeek) == 0 && Objects.equals(id, that.id) && Objects.equals(maintenanceName, that.maintenanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maintenanceName, amountOfCarePerWeek);
    }
}
