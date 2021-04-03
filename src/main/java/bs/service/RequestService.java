package bs.service;

import bs.component.DatePrinter;
import bs.model.Request;
import bs.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    private DatePrinter datePrinter;

    @Autowired
    public void setSampleComponent(DatePrinter datePrinter) {
        this.datePrinter = datePrinter;
    }

    @Autowired
    private RequestRepository requestRepository;

    public void printRequestInfo() {
        datePrinter.printDate();
        System.out.println(requestRepository.findAll());
    }

    public int calcPrice(){
        int sum = 0;
        for (Request req : requestRepository.findAll()) {
            sum += req.getPrice();
        }
        return sum;
    }

//ff
}
