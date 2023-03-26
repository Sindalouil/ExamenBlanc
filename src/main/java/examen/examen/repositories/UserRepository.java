package examen.examen.repositories;

import examen.examen.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<Object> findByFnameAndLname(String fname, String lname);
}
