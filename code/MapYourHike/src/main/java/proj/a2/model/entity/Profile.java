package proj.a2.model.entity;

import javax.persistence.*;

@Entity
@Table(name="profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "profileId")
    private int profileId;

    @OneToOne
    @JoinColumn(name = "userId")
    private UserAccount user;

    @Column(name = "profileName",length = 30,nullable = false)
    private String profileName;

    @Column(name = "profileDescription",length = 100,nullable = false)
    private String profileDescription;

    public Profile() {
    }

    public Profile(UserAccount user, String profileName, String profileDescription) {
        this.user=user;
        this.profileName = profileName;
        this.profileDescription = profileDescription;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public Profile clone(){
        Profile profile  = new Profile();
        profile.setProfileId(this.profileId);
        profile.setUser(this.user);
        profile.setProfileName(this.profileName);
        profile.setProfileDescription(this.profileDescription);
        return profile;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "profileId=" + profileId +
                ", user=" + user +
                ", profileName='" + profileName + '\'' +
                ", profileDescription='" + profileDescription + '\'' +
                '}';
    }
}
