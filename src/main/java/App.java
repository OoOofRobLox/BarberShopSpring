import bs.component.DumbComponent;
import bs.config.ApplicationConfig;
import bs.model.Customer;
import bs.repository.CustomerRepository;
import bs.service.DumbService;
import bs.service.RequestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "bs")
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
//        for (Customer customer : customerRepository.findAll()){
//            System.out.println(customer);
//        }
//        RequestService requestService = context.getBean(RequestService.class);
//        requestService.printRequestInfo();
//        System.out.println(requestService.calcPrice());

    }
}
