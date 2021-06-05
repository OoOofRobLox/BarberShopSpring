package bs.model;


import javax.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(mappedBy = "schedule")
    private BarberShop barberShop;

    @Column(name = "day1")
    private String day1;

    @Column(name = "day2")
    private String day2;

    @Column(name = "day3")
    private String day3;

    @Column(name = "day4")
    private String day4;

    @Column(name = "day5")
    private String day5;

    @Column(name = "day6")
    private String day6;

    @Column(name = "day7")
    private String day7;

    @Column(name = "workDay1Length")
    private int workDay1Length;

    @Column(name = "workDay2Length")
    private int workDay2Length;

    @Column(name = "workDay3Length")
    private int workDay3Length;

    @Column(name = "workDay4Length")
    private int workDay4Length;

    @Column(name = "workDay5Length")
    private int workDay5Length;

    @Column(name = "workDay6Length")
    private int workDay6Length;

    @Column(name = "workDay7Length")
    private int workDay7Length;

    public Schedule() {
    }

    public Schedule(Integer id, BarberShop barberShop, String day1, String day2, String day3, String day4, String day5,
                    String day6, String day7, int workDay1Length, int workDay2Length, int workDay3Length, int workDay4Length,
                    int workDay5Length, int workDay6Length, int workDay7Length) {
        this.id = id;
        this.barberShop = barberShop;
        this.day1 = day1;
        this.day2 = day2;
        this.day3 = day3;
        this.day4 = day4;
        this.day5 = day5;
        this.day6 = day6;
        this.day7 = day7;
        this.workDay1Length = workDay1Length;
        this.workDay2Length = workDay2Length;
        this.workDay3Length = workDay3Length;
        this.workDay4Length = workDay4Length;
        this.workDay5Length = workDay5Length;
        this.workDay6Length = workDay6Length;
        this.workDay7Length = workDay7Length;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BarberShop getBarberShop() {
        return barberShop;
    }

    public void setBarberShop(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public String getDay3() {
        return day3;
    }

    public void setDay3(String day3) {
        this.day3 = day3;
    }

    public String getDay4() {
        return day4;
    }

    public void setDay4(String day4) {
        this.day4 = day4;
    }

    public String getDay5() {
        return day5;
    }

    public void setDay5(String day5) {
        this.day5 = day5;
    }

    public String getDay6() {
        return day6;
    }

    public void setDay6(String day6) {
        this.day6 = day6;
    }

    public String getDay7() {
        return day7;
    }

    public void setDay7(String day7) {
        this.day7 = day7;
    }

    public int getWorkDay1Length() {
        return workDay1Length;
    }

    public void setWorkDay1Length(int workDay1Length) {
        this.workDay1Length = workDay1Length;
    }

    public int getWorkDay2Length() {
        return workDay2Length;
    }

    public void setWorkDay2Length(int workDay2Length) {
        this.workDay2Length = workDay2Length;
    }

    public int getWorkDay3Length() {
        return workDay3Length;
    }

    public void setWorkDay3Length(int workDay3Length) {
        this.workDay3Length = workDay3Length;
    }

    public int getWorkDay4Length() {
        return workDay4Length;
    }

    public void setWorkDay4Length(int workDay4Length) {
        this.workDay4Length = workDay4Length;
    }

    public int getWorkDay5Length() {
        return workDay5Length;
    }

    public void setWorkDay5Length(int workDay5Length) {
        this.workDay5Length = workDay5Length;
    }

    public int getWorkDay6Length() {
        return workDay6Length;
    }

    public void setWorkDay6Length(int workDay6Length) {
        this.workDay6Length = workDay6Length;
    }

    public int getWorkDay7Length() {
        return workDay7Length;
    }

    public void setWorkDay7Length(int workDay7Length) {
        this.workDay7Length = workDay7Length;
    }
}
