package bs.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "barbershop")
public class BarberShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Hall> halls;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id")
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
