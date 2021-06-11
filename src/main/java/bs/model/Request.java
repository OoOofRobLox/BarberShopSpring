package bs.model;

import javax.persistence.*;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "service")
    private String service;

    @Column(name = "day")
    private String day;

    @Column(name = "Time")
    private int time;

    @Column(name = "length")
    private int length;

    @Column(name = "price")
    private int price;

    @Column(name = "type")
    private boolean type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Request() {
    }

    public Request(String service, String day, int time, int length, int price, boolean type, Customer customer) {
        this.service = service;
        this.day = day;
        this.time = time;
        this.length = length;
        this.price = price;
        this.type = type;
        this.customer = customer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
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
                ", service='" + service + '\'' + '\n' +
                ", day=" + day + '\n' +
                ", time=" + time + '\n' +
                ", length=" + length + '\n' +
                ", price=" + price + '\n' +
                ", type=" + type + '\n' +
                ", customer=" + customer.getName() + '\n' +
                '}' + '\n';
    }
}
