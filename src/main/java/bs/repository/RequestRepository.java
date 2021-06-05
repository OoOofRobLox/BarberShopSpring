package bs.repository;

import bs.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RequestRepository extends CrudRepository<Request, Integer> {

    List<Request> findAll();
    /*Branch getByIndex(int index);*/
    Optional<Request> findByName(String name);
}
