package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.a2.model.entity.Trip;

public interface TripDAO extends JpaRepository<Trip, Integer> {
}
