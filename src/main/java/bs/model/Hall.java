package bs.model;

import java.util.List;
import java.util.Set;

public class Hall {
    private List<Hairdresser> hairdressers;
    private Set<Request> requests;

    public Hall() {
    }

    public Hall(List<Hairdresser> hairdressers, Set<Request> requests) {
        this.hairdressers = hairdressers;
        this.requests = requests;
    }

    public List<Hairdresser> getHairdressers() {
        return hairdressers;
    }

    public void setHairdressers(List<Hairdresser> hairdressers) {
        this.hairdressers = hairdressers;
    }

    public Set<Request> getRequests() {
        return requests;
    }

    public void setRequests(Set<Request> requests) {
        this.requests = requests;
    }
}
