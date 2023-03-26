package examen.examen.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

   @JsonIgnore
   @OneToMany(mappedBy = "project",cascade = CascadeType.PERSIST)
   private List<Sprint> sprints;

}
