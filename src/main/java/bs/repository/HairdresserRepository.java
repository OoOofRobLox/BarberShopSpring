package bs.repository;

import bs.model.Hairdresser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HairdresserRepository extends JpaRepository<Hairdresser, Integer> {
    List<Hairdresser> findAll();
    List<Hairdresser> findByName(String name);
    Optional<Hairdresser> findById(Integer id);
}
