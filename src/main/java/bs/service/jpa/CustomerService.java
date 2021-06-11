package bs.service.jpa;

import bs.model.Customer;
import bs.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomer(int id) {
        return customerRepository.getById(id);
    }

    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }

    public void removeCustomer(int id) {
        removeCustomer(customerRepository.getById(id));
    }

    private void removeCustomer(Customer customer) {
        customerRepository.delete(customer);
    }
}
