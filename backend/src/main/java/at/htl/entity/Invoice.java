package at.htl.entity;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonbProperty("plant")
    private Plant plant;
    @ManyToOne
    @JsonbProperty("customer")
    private Customer customer;
    private LocalDate dateOfTransaction;

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(LocalDate dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invoice)) return false;
        Invoice that = (Invoice) o;
        return Objects.equals(id, that.id) && Objects.equals(plant, that.plant) && Objects.equals(customer, that.customer) && Objects.equals(dateOfTransaction, that.dateOfTransaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plant, customer, dateOfTransaction);
    }
}
