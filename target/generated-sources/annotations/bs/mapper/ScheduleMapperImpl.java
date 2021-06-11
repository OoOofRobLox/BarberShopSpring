package bs.mapper;

import bs.dto.ScheduleDTO;
import bs.model.Schedule;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-11T15:39:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class ScheduleMapperImpl implements ScheduleMapper {

    @Override
    public ScheduleDTO toDTO(Schedule schedule) {
        if ( schedule == null ) {
            return null;
        }

        ScheduleDTO scheduleDTO = new ScheduleDTO();

        if ( schedule.getId() != null ) {
            scheduleDTO.setId( schedule.getId() );
        }
        if ( schedule.getDay1() != null ) {
            scheduleDTO.setDay1( schedule.getDay1() );
        }
        if ( schedule.getDay2() != null ) {
            scheduleDTO.setDay2( schedule.getDay2() );
        }
        if ( schedule.getDay3() != null ) {
            scheduleDTO.setDay3( schedule.getDay3() );
        }
        if ( schedule.getDay4() != null ) {
            scheduleDTO.setDay4( schedule.getDay4() );
        }
        if ( schedule.getDay5() != null ) {
            scheduleDTO.setDay5( schedule.getDay5() );
        }
        if ( schedule.getDay6() != null ) {
            scheduleDTO.setDay6( schedule.getDay6() );
        }
        if ( schedule.getDay7() != null ) {
            scheduleDTO.setDay7( schedule.getDay7() );
        }
        scheduleDTO.setWorkDay1Length( schedule.getWorkDay1Length() );
        scheduleDTO.setWorkDay2Length( schedule.getWorkDay2Length() );
        scheduleDTO.setWorkDay3Length( schedule.getWorkDay3Length() );
        scheduleDTO.setWorkDay4Length( schedule.getWorkDay4Length() );
        scheduleDTO.setWorkDay5Length( schedule.getWorkDay5Length() );
        scheduleDTO.setWorkDay6Length( schedule.getWorkDay6Length() );
        scheduleDTO.setWorkDay7Length( schedule.getWorkDay7Length() );

        return scheduleDTO;
    }

    @Override
    public Schedule toSchedule(ScheduleMapper scheduleDTO) {
        if ( scheduleDTO == null ) {
            return null;
        }

        Schedule schedule = new Schedule();

        return schedule;
    }
}
