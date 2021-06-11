package bs.mapper;

import bs.dto.BarberShopDTO;
import bs.model.BarberShop;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-11T15:39:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class BarberShopMapperImpl implements BarberShopMapper {

    @Override
    public BarberShopDTO toDTO(BarberShop barberShop) {
        if ( barberShop == null ) {
            return null;
        }

        BarberShopDTO barberShopDTO = new BarberShopDTO();

        return barberShopDTO;
    }

    @Override
    public BarberShop toBarberShop(BarberShopDTO barberShopDTO) {
        if ( barberShopDTO == null ) {
            return null;
        }

        BarberShop barberShop = new BarberShop();

        return barberShop;
    }
}
