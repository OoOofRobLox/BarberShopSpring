package bs.mapper;

import bs.dto.HallDTO;
import bs.model.Hall;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface HallMapper {
    HallMapper INSTANCE = Mappers.getMapper(HallMapper.class);
    HallDTO toDTO(Hall hall);
    Hall toHall(HallDTO hallDTO);
}
