package bs.repository;

import bs.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerRepository {

    List<Customer> findAll();

    List<Customer> findByName(String name);

    Customer findById(UUID uid);
}
