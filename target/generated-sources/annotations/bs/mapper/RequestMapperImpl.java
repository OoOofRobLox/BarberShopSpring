package bs.mapper;

import bs.dto.CustomerDTO;
import bs.dto.RequestDTO;
import bs.model.Customer;
import bs.model.Request;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-11T15:39:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class RequestMapperImpl implements RequestMapper {

    @Override
    public RequestDTO toDTO(Request request) {
        if ( request == null ) {
            return null;
        }

        RequestDTO requestDTO = new RequestDTO();

        if ( request.getService() != null ) {
            requestDTO.setService( request.getService() );
        }
        if ( request.getDay() != null ) {
            requestDTO.setDay( request.getDay() );
        }
        requestDTO.setTime( request.getTime() );
        requestDTO.setLength( request.getLength() );
        requestDTO.setPrice( request.getPrice() );
        requestDTO.setType( request.isType() );
        if ( request.getCustomer() != null ) {
            requestDTO.setCustomer( customerToCustomerDTO( request.getCustomer() ) );
        }

        return requestDTO;
    }

    @Override
    public Request toRequest(RequestDTO requestDTO) {
        if ( requestDTO == null ) {
            return null;
        }

        Request request = new Request();

        if ( requestDTO.getService() != null ) {
            request.setService( requestDTO.getService() );
        }
        if ( requestDTO.getDay() != null ) {
            request.setDay( requestDTO.getDay() );
        }
        request.setTime( requestDTO.getTime() );
        request.setLength( requestDTO.getLength() );
        request.setPrice( requestDTO.getPrice() );
        request.setType( requestDTO.isType() );
        if ( requestDTO.getCustomer() != null ) {
            request.setCustomer( customerDTOToCustomer( requestDTO.getCustomer() ) );
        }

        return request;
    }

    protected CustomerDTO customerToCustomerDTO(Customer customer) {
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

    protected Customer customerDTOToCustomer(CustomerDTO customerDTO) {
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
