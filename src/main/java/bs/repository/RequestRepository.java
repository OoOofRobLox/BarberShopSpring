package bs.repository;

import bs.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
    List<Request> findAll();
    List<Request> findByService(String service);
    Optional<Request> findById(Integer id);
}
