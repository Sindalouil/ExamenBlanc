package examen.examen.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String title ;
    private String description ;


   @ManyToMany()
   private List<User> users;

    @OneToMany(mappedBy = "project")
    private List<Sprint> sprint;

}
