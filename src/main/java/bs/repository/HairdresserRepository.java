package bs.repository;

import bs.model.Hairdresser;

import java.util.List;
import java.util.UUID;

public interface HairdresserRepository {

    List<Hairdresser> findAll();

    List<Hairdresser> findByName(String name);

    void add(Hairdresser hairdresser);

    Hairdresser getByUUID(UUID uuid);

    void deleteById (UUID uuid);

}
