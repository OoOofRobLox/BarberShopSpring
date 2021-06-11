package bs.service.jpa;

import bs.model.Hairdresser;
import bs.repository.HairdresserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HairdresserService {

    @Autowired
    private HairdresserRepository hairdresserRepository;

    public Hairdresser getHairdresser(int id) {
        return hairdresserRepository.getById(id);
    }

    public void removeHairdresser(int id){
        removeHairdresser(hairdresserRepository.getById(id));
    }

    private void removeHairdresser(Hairdresser hairdresser) {
        hairdresserRepository.delete(hairdresser);
    }
}
