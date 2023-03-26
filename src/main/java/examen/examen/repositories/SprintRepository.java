package examen.examen.repositories;

import examen.examen.entities.Sprint;
import examen.examen.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Integer> {
}
