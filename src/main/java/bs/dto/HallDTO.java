package bs.dto;


import bs.model.BarberShop;
import bs.model.Customer;
import bs.model.Hairdresser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HallDTO {

    private Integer id;
    private List<HairdresserDTO> hairdressersDTO;
    private List<CustomerDTO> customersDTO;
    private BarberShopDTO barberShopDTO;
}
