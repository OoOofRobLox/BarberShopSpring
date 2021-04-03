package bs.repository;

import bs.model.Customer;
import bs.model.Day;
import bs.model.Request;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class RequestRepositoryImpl implements RequestRepository{

    private List<Customer> customers = Arrays.asList(
            new Customer("a","a","1"),
            new Customer("b","b","2"),
            new Customer("c","c","3"),
            new Customer("d","d","4")
    );

    private List<Request> requests = Arrays.asList(
            new Request("Haircut", Day.SATURDAY, 1, 1, 1, true, customers.get(0)),
            new Request("Washing", Day.SATURDAY, 2, 2, 2, true, customers.get(1)),
            new Request("IDK", Day.SATURDAY, 3, 3, 3, false, customers.get(2)),
            new Request("ZXC", Day.SATURDAY, 4, 4, 4, true, customers.get(3))
    );

    @Override
    public List<Request> findAll() {
        return requests;
    }

    @Override
    public List<Request> findByDay() {
        return null;
    }

    @Override
    public List<Request> findByCustomer() {
        return null;
    }

    @Override
    public Request findById(UUID uid) {
        return null;
    }
}
