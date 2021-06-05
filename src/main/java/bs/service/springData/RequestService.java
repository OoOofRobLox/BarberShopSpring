package bs.service.springData;


import bs.dto.RequestDTO;
import bs.model.Request;
import bs.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {
    @Autowired
    private RequestService requestRepository;

    public void save(RequestDTO reqDto){
    }
}
