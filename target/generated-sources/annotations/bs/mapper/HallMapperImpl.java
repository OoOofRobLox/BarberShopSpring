package bs.mapper;

import bs.dto.HallDTO;
import bs.model.Hall;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-11T15:39:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class HallMapperImpl implements HallMapper {

    @Override
    public HallDTO toDTO(Hall hall) {
        if ( hall == null ) {
            return null;
        }

        HallDTO hallDTO = new HallDTO();

        return hallDTO;
    }

    @Override
    public Hall toHall(HallDTO hallDTO) {
        if ( hallDTO == null ) {
            return null;
        }

        Hall hall = new Hall();

        return hall;
    }
}
