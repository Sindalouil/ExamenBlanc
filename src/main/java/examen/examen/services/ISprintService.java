package examen.examen.services;

import examen.examen.entities.Sprint;
import examen.examen.repositories.SprintRepository;

import java.util.List;

public interface ISprintService {
    List<Sprint> retrieveAllSprints();
    Sprint updateSprint(Sprint sprint);
    Sprint addSprint(Sprint sprint);
    Sprint retrieveSprint(Integer id);
    void removeSprint(Integer id);

}
