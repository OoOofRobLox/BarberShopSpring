package bs.mapper;

import bs.dto.ScheduleDTO;
import bs.model.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface ScheduleMapper {
    ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);
    ScheduleDTO toDTO(Schedule schedule);
    Schedule toSchedule(ScheduleMapper scheduleDTO);
}
