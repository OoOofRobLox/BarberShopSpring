package bs.service.jpa;

import bs.model.Request;
import bs.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public Request getRequest(int id) {
        return requestRepository.getById(id);
    }

    public void removeRequestById(int id) {
        removeRequest(requestRepository.getById(id));
    }

    public void removeRequest(Request request) {
        requestRepository.delete(request);
    }
}