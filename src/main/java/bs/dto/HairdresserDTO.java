package bs.dto;

import bs.model.Hairdresser;
import bs.model.Hall;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HairdresserDTO {

    private Integer id;
    private String name;
    private String surname;
    private int salary;
    private HallDTO hallDTO;

}
