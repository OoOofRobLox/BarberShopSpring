package bs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO {

    private Integer id;
    private String day1;
    private String day2;
    private String day3;
    private String day4;
    private String day5;
    private String day6;
    private String day7;
    private int workDay1Length;
    private int workDay2Length;
    private int workDay3Length;
    private int workDay4Length;
    private int workDay5Length;
    private int workDay6Length;
    private int workDay7Length;
    private BarberShopDTO barberShopDTO;
}
