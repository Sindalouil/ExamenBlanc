package examen.examen.repositories;

import examen.examen.entities.Project;
import examen.examen.entities.Role;
import examen.examen.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findAllBySprintsStartDateLessThan(Date date);
    List<Project> findAllByUsersRoleAndUsersFnameAndUsersLname(Role role, String fname, String lname);
}
