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



}
