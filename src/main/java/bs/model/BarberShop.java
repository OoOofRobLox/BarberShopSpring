package bs.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "barbershop")
public class BarberShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "barbershop")
    private List<Hall> halls;

    @OneToOne(mappedBy = "barbershop")
    private Schedule schedule;


    public BarberShop() {
    }

    public BarberShop(Schedule schedule, List<Hall> halls) {
        this.schedule = schedule;
        this.halls = halls;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setScheduleSet(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }
}
