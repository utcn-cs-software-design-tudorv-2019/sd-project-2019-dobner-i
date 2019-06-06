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

    public Place() {
    }

    public Place(String height, String coordonates) {
        this.height = height;
        this.coordonates = coordonates;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCoordonates() {
        return coordonates;
    }

    public void setCoordonates(String coordonates) {
        this.coordonates = coordonates;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeId=" + placeId +
                ", height='" + height + '\'' +
                ", coordonates='" + coordonates + '\'' +
                '}';
    }
}
