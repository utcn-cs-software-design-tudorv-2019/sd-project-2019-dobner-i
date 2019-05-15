package proj.a2.model.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "placeId")
    private int placeId;

    @Column(name = "height",length = 30,nullable = false)
    private String height;

    @Column(name = "coordonates",length = 30,nullable = false)
    private String coordonates;

}
