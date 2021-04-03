package bs.repository;

import bs.model.Request;

import java.util.List;
import java.util.UUID;

public interface RequestRepository {

    List<Request> findAll();

    List<Request> findByDay();

    List<Request> findByCustomer();

    Request findById(UUID uid);
}
