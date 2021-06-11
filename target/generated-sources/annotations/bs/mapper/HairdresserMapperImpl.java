package bs.mapper;

import bs.dto.HairdresserDTO;
import bs.model.Hairdresser;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-11T15:39:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class HairdresserMapperImpl implements HairdresserMapper {

    @Override
    public HairdresserDTO toDTO(Hairdresser hairdresser) {
        if ( hairdresser == null ) {
            return null;
        }

        HairdresserDTO hairdresserDTO = new HairdresserDTO();

        if ( hairdresser.getName() != null ) {
            hairdresserDTO.setName( hairdresser.getName() );
        }
        if ( hairdresser.getSurname() != null ) {
            hairdresserDTO.setSurname( hairdresser.getSurname() );
        }
        hairdresserDTO.setSalary( hairdresser.getSalary() );

        return hairdresserDTO;
    }

    @Override
    public Hairdresser toHairdresser(HairdresserDTO hairdresserDTO) {
        if ( hairdresserDTO == null ) {
            return null;
        }

        Hairdresser hairdresser = new Hairdresser();

        if ( hairdresserDTO.getName() != null ) {
            hairdresser.setName( hairdresserDTO.getName() );
        }
        if ( hairdresserDTO.getSurname() != null ) {
            hairdresser.setSurname( hairdresserDTO.getSurname() );
        }
        hairdresser.setSalary( hairdresserDTO.getSalary() );

        return hairdresser;
    }
}
