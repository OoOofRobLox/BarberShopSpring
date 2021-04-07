package bs.model;

import java.util.UUID;

public class Hairdresser {
    private UUID uuid;
    private String name;
    private String surname;
    private int salary;

    public Hairdresser() {
    }

    public Hairdresser(String name, String surname, int salary, UUID uuid) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
