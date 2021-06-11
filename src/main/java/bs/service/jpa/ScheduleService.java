package bs.service.jpa;

import bs.model.Schedule;
import bs.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public Schedule getSchedule(int id) {
        return scheduleRepository.getById(id);
    }

    public Schedule add(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public void removeSchedule(int id){
        removeSchedule(scheduleRepository.getById(id));
    }

    private void removeSchedule(Schedule schedule) {
        scheduleRepository.delete(schedule);
    }
}
