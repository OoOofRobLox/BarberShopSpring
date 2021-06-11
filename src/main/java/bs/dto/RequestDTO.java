package bs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDTO {

    private Integer id;
    private String service;
    private String day;
    private int time;
    private int length;
    private int price;
    private boolean type;
    private CustomerDTO customer;

}
