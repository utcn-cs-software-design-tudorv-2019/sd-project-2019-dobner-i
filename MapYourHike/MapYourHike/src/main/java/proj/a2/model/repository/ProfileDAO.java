package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.a2.model.entity.Profile;

public interface ProfileDAO extends JpaRepository<Profile, Integer> {
}
