package models;

import lombok.Builder;
import lombok.Data;


import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name="Movie")
public class Movie {
    @Id
    @GeneratedValue
    @Column(name = "movieId")
    private String movieId;
    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;
    @Column(name="genre")
    private String genre;
    @Column(name="length")
    private int length;
    @Column(name="releaseYear")
    private String releaseYear;
    @ManyToOne
    @JoinColumn(name="studioId")
    Studio studioId;

}
