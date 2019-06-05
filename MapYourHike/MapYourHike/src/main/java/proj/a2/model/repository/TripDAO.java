package proj.a2.model.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import proj.a2.model.entity.Trip;

public interface TripDAO extends JpaRepository<Trip, Integer> {
    public Trip findByMountain(String mountain);
    public List<Trip> findAllByMountain(String mountain);
}
