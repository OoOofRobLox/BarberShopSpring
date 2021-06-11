package bs.dto;

import bs.model.Customer;
import bs.model.Hall;
import bs.model.Request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private Integer id;
    private String name;
    private String surname;
    private String phoneNumber;
    private RequestDTO requestDTO;
    private HallDTO hallDTO;

}
