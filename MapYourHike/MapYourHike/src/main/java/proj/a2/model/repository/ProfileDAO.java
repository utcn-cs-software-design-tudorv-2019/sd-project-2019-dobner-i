package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.a2.model.entity.*;

public interface ProfileDAO extends JpaRepository<Profile, Integer> {
    public Profile findByUser(UserAccount userAccount);
    public Profile findByProfileId(int profileId);
}
