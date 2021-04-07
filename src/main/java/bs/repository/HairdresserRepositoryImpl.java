package bs.repository;

import bs.model.Hairdresser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class HairdresserRepositoryImpl implements HairdresserRepository {

    private List<Hairdresser> data = new ArrayList<>();


    @Override
    public List<Hairdresser> findAll() {
        return data;
    }

    @Override
    public List<Hairdresser> findByName(String name) {
        return null;
    }

    @Override
    public void add(Hairdresser hairdresser) {
        data.add(hairdresser);
    }

    @Override
    public Hairdresser getByUUID(UUID uuid) {
        return data.stream().filter(curr -> Objects.equals(curr.getUuid(), uuid)).findFirst().orElse(null);
    }

    @Override
    public void deleteById(UUID uuid) {
        data.removeIf(curr -> Objects.equals(curr.getUuid(), uuid));
    }
}
