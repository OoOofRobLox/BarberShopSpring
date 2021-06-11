package bs.dto;

import bs.model.BarberShop;
import bs.model.Hall;
import bs.model.Schedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BarberShopDTO {

    private Integer id;
    private List<HallDTO> hallsDTO;
    private ScheduleDTO scheduleDTO;

}
