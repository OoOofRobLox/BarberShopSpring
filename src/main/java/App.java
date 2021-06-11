import bs.component.DumbComponent;
import bs.config.ApplicationConfig;
import bs.dto.RequestDTO;
import bs.dto.ScheduleDTO;
import bs.mapper.RequestMapper;
import bs.mapper.ScheduleMapper;
import bs.model.Customer;
import bs.model.Request;
import bs.model.Schedule;
import bs.repository.CustomerRepository;
import bs.service.DumbService;
import bs.service.jpa.CustomerService;
import bs.service.jpa.RequestService;
import bs.service.jpa.ScheduleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "bs")
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ScheduleService ss = context.getBean(ScheduleService.class);
        Schedule schedule = ss.getSchedule(1);
        ScheduleDTO scheduleDTO = ScheduleMapper.INSTANCE.toDTO(schedule);
        System.out.println(scheduleDTO.getId());
        System.out.println(scheduleDTO.getDay3());
        //RequestService rs = context.getBean(RequestService.class);
        //Request req = rs.getRequest(1);
        //RequestDTO reqDTO = RequestMapper.INSTANCE.toDTO(req);


        //System.out.print(reqDTO.getService());
//        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
//        for (Customer customer : customerRepository.findAll()){
//            System.out.println(customer);
//        }
//        RequestService requestService = context.getBean(RequestService.class);
//        requestService.printRequestInfo();
//        System.out.println(requestService.calcPrice());

    }
}
