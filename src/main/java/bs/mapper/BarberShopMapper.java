package bs.mapper;

import bs.dto.BarberShopDTO;
import bs.model.BarberShop;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface BarberShopMapper {
    BarberShopMapper INSTANCE = Mappers.getMapper(BarberShopMapper.class);
    BarberShopDTO toDTO(BarberShop barberShop);
    BarberShop toBarberShop(BarberShopDTO barberShopDTO);
}
