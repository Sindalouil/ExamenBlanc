package examen.examen.entities;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String pwd;
    private String fName;
    private String lName;
    @Enumerated (EnumType.STRING)
    private Role role ;

   @ManyToMany(mappedBy = "User")
   private List<Project> Projects ;

   @OneToMany()
   private List<Project> projectUser;

}
