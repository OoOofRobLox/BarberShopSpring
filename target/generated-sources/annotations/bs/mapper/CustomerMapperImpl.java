package bs.mapper;

import bs.dto.CustomerDTO;
import bs.model.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-11T15:39:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO toDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        if ( customer.getName() != null ) {
            customerDTO.setName( customer.getName() );
        }
        if ( customer.getSurname() != null ) {
            customerDTO.setSurname( customer.getSurname() );
        }
        if ( customer.getPhoneNumber() != null ) {
            customerDTO.setPhoneNumber( customer.getPhoneNumber() );
        }

        return customerDTO;
    }

    @Override
    public Customer toCustomer(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        if ( customerDTO.getName() != null ) {
            customer.setName( customerDTO.getName() );
        }
        if ( customerDTO.getSurname() != null ) {
            customer.setSurname( customerDTO.getSurname() );
        }
        if ( customerDTO.getPhoneNumber() != null ) {
            customer.setPhoneNumber( customerDTO.getPhoneNumber() );
        }

        return customer;
    }
}
