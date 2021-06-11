package bs.mapper;

import bs.dto.RequestDTO;
import bs.model.Request;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface RequestMapper {
    RequestMapper INSTANCE = Mappers.getMapper(RequestMapper.class);
    RequestDTO toDTO(Request request);
    Request toRequest(RequestDTO requestDTO);
}
