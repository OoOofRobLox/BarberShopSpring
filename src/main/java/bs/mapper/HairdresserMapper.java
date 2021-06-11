package bs.mapper;

import bs.dto.HairdresserDTO;
import bs.model.Hairdresser;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface HairdresserMapper {
    HairdresserMapper INSTANCE = Mappers.getMapper(HairdresserMapper.class);
    HairdresserDTO toDTO(Hairdresser hairdresser);
    Hairdresser toHairdresser(HairdresserDTO hairdresserDTO);
}
