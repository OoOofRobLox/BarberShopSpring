package bs.component;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DatePrinter {

    public void printDate(){
        System.out.println(new Date());
    }
}
