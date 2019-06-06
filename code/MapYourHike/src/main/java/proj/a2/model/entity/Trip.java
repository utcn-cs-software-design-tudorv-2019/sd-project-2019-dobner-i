package proj.a2.model.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tripId")
    private int tripId;

    @ManyToOne
    @JoinColumn(name = "profileId")
    private Profile profile;

    @Column(name = "mountain",length = 30,nullable = false)
    private String mountain;

    @OneToOne
    @JoinColumn(name = "initialPlaceId")
    private Place initialPlace;

    @OneToOne
    @JoinColumn(name = "targetPlaceId")
    private Place targetPlace;

    public Trip() {
    }

    public Trip(Profile profile, String mountain, Place initialPlace, Place targetPlace) {
        this.profile = profile;
        this.mountain = mountain;
        this.initialPlace = initialPlace;
        this.targetPlace = targetPlace;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getMountain() {
        return mountain;
    }

    public void setMountain(String mountain) {
        this.mountain = mountain;
    }

    public Place getInitialPlace() {
        return initialPlace;
    }

    public void setInitialPlace(Place initialPlace) {
        this.initialPlace = initialPlace;
    }

    public Place getTargetPlace() {
        return targetPlace;
    }

    public void setTargetPlace(Place targetPlace) {
        this.targetPlace = targetPlace;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripId=" + tripId +
                ", profile=" + profile +
                ", mountain='" + mountain + '\'' +
                ", initialPlace=" + initialPlace +
                ", targetPlace=" + targetPlace +
                '}';
    }
}
