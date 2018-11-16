package models;

import lombok.Builder;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Table(name="Studio")
public class Studio {

    @Id
    @GeneratedValue
    @Column(name="studioId")
    private int studioId;
    @Column(name="countryCode")
    private String countryCode;
    @Column(name="postCode")
    private String postCode;
    @OneToMany(mappedBy="studioId")
    private List<Movie> movies;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="actor_movie")
    private List<Actor> actors;
}
