package proj.a2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.a2.model.entity.UserAccount;


public interface UserAccountDAO extends JpaRepository<UserAccount, Integer> {
    public UserAccount findByUserName(String userName);
    public UserAccount findByUserNameAndUserPassword(String userName, String userPassword);

}
