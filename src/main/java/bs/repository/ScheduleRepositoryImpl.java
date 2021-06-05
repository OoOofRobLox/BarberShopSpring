//package bs.repository;
//
//import bs.model.Schedule;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.UUID;
//
//@Repository
//public class ScheduleRepositoryImpl implements ScheduleRepository {
//
//    private List<Schedule> list = new ArrayList<Schedule>();
//
//    @Override
//    public Schedule getById(Integer id) {
//        return list.get(id);
//    }
//
//    @Override
//    public List<Schedule> getAll() {
//        return list;
//    }
//
//    @Override
//    public void deleteById(UUID uuid) {
//        list.removeIf(curr -> Objects.equals(curr.getUuid(), uuid));
//    }
//}
