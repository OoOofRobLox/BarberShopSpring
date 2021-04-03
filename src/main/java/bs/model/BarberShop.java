package bs.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BarberShop {


    private Set<Schedule> scheduleSet = new HashSet<>();
    private List<Hall> halls;

    public BarberShop() {
    }

    public BarberShop(Set<Schedule> scheduleSet, List<Hall> halls) {
        this.scheduleSet = scheduleSet;
        this.halls = halls;
    }

    public Set<Schedule> getScheduleSet() {
        return scheduleSet;
    }

    public void setScheduleSet(Set<Schedule> scheduleSet) {
        this.scheduleSet = scheduleSet;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }
}
