package proj.a2.model.service;
import proj.a2.model.repository.PlaceDAO;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {
    @Inject
    PlaceDAO placedao;
}
