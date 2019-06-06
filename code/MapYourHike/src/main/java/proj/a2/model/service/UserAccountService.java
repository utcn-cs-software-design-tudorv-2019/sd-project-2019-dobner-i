package proj.a2.model.service;
import org.springframework.stereotype.Service;
import proj.a2.model.repository.*;
import proj.a2.model.entity.*;
import javax.inject.Inject;

@Service
public class UserAccountService {
    @Inject
    UserAccountDAO userDAO;

    @Inject
    ProfileDAO profileDAO;

    public Boolean checkUser(UserAccount user)
    {
        //return false if the user is incorrect
        Boolean correctUser=false;
        UserAccount founduser=userDAO.findByUserName(user.getUserName());
        if(founduser==null)return correctUser;
        if(founduser.getUserPassword().equals(user.getUserPassword()))correctUser=true;
        return correctUser;
    }
    public UserAccount findUser(UserAccount user){
        return userDAO.findByUserNameAndUserPassword(user.getUserName(),user.getUserPassword());
    }
    public Profile findProfile(UserAccount user){
        Profile profile=profileDAO.findByUser(user);
        if(profile!=null)
            return profile;
        Profile emptyProfile=new Profile(user, user.getUserName(), "Add description");
        profileDAO.save(emptyProfile);
        return emptyProfile;
    }
}
