package proj.a2.model.service;

import proj.a2.model.repository.ProfileDAO;
import proj.a2.model.entity.*;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Inject
    ProfileDAO profileDAO;

    public boolean checkIfExists(Profile profile){
        Profile profile_search = profileDAO.findByProfileId(profile.getProfileId());
        if(profile_search == null) return false;
        return true;
    }
    public Profile viewProfile(Profile profile){
        return profileDAO.findByProfileId(profile.getProfileId());
    }
    public void updateProfile(Profile profile)
    {

        Profile person=profileDAO.findByProfileId(profile.getProfileId());
        if(person!=null) {
            profileDAO.delete(person);
            profileDAO.save(profile);
        }
    }
    public void deleteProfile(Profile profile) {
        Profile person = profileDAO.findByProfileId(profile.getProfileId());
        profileDAO.delete(person);
        //may cause problem with the trips
    }
    public void createProfile(Profile profile)
    {

        profileDAO.save(profile);

    }
}
