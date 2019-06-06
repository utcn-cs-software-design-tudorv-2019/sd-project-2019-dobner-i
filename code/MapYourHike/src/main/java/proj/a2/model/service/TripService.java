package proj.a2.model.service;
import proj.a2.model.repository.TripDAO;
import proj.a2.model.entity.Trip;
import javax.inject.Inject;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class TripService {
    @Inject
    TripDAO tripDAO;
    public boolean checkIfExists(Trip trip){
        Trip trip_search = tripDAO.findByMountain(trip.getMountain());
        if(trip_search == null) return false;
        return true;
    }
    public List<Trip> viewTrip(Trip trip){

        return tripDAO.findAllByMountain(trip.getMountain());
    }
}
