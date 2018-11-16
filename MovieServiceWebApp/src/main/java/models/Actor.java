package models;

import lombok.Builder;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@Entity
@Table(name="Actor")
public class Actor {

    @Id
    @GeneratedValue
    @Column(name="actorId")
    private int actorId;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="birthday")
    private LocalDate birthday;
    @Column(name="sex")
    private String sex;


}
