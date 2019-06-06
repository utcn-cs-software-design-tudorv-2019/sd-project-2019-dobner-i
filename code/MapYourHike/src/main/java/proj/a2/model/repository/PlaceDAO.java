package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.a2.model.entity.Place;

public interface PlaceDAO extends JpaRepository<Place, Integer> {
}
