package bs.dto;

import bs.model.Customer;
import bs.model.Hairdresser;
import bs.model.Hall;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hall")
public class HallDTO {
    private List<Hairdresser> hairdressers;

    private List<Customer> customers;

    public HallDTO(List<Hairdresser> hairdressers, List<Customer> customers) {
        this.hairdressers = hairdressers;
        this.customers = customers;
    }

    public HallDTO(Hall hall) {
        this.hairdressers = hall.getHairdressers();
        this.customers = hall.getCustomers();
    }

    public List<Hairdresser> getHairdressers() {
        return hairdressers;
    }

    public void setHairdressers(List<Hairdresser> hairdressers) {
        this.hairdressers = hairdressers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
