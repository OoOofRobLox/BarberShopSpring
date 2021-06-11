package bs.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hall")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "hall")
    private List<Hairdresser> hairdressers;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Customer> customers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "barbershop_id")
    private BarberShop barberShop;

    public Hall() {
    }

    public Hall(List<Hairdresser> hairdressers, List<Customer> customers) {
        this.hairdressers = hairdressers;
        this.customers = customers;
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
