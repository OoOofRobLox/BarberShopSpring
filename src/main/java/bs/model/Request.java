package bs.model;

import java.util.UUID;

public class Request {
    UUID uuid = UUID.randomUUID();
    private String service;
    private Day day;
    private int time;
    private int length;
    private int price;
    private boolean type;
    private Customer customer;

    public Request() {
    }

    public Request(String service,Day day, int time, int length, int price, boolean type, Customer customer) {
        this.service = service;
        this.day = day;
        this.time = time;
        this.length = length;
        this.price = price;
        this.type = type;
        this.customer = customer;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Request{" +
                "uuid=" + uuid + '\n' +
                ", service='" + service + '\'' + '\n' +
                ", day=" + day + '\n' +
                ", time=" + time + '\n' +
                ", length=" + length + '\n' +
                ", price=" + price + '\n' +
                ", type=" + type + '\n' +
                ", customer=" + customer.getName() + '\n' +
                '}' + '\n' ;
    }
}
