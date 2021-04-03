package bs.model;


import java.util.UUID;

public class Schedule {

    UUID uuid = UUID.randomUUID();
    private Day day;
    private int workDayLength;

    public Schedule() {
    }

    public Schedule(Day day, int workDayLength) {
        this.day = day;
        this.workDayLength = workDayLength;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public int getWorkDayLength() {
        return workDayLength;
    }

    public void setWorkDayLength(int workDayLength) {
        this.workDayLength = workDayLength;
    }
}
