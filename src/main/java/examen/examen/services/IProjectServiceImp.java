package examen.examen.services;

import examen.examen.entities.Sprint;
import examen.examen.repositories.ProjectRepository;
import examen.examen.repositories.SprintRepository;

import javax.transaction.Transactional;

public class IProjectServiceImp implements IProjectService {
    private final ProjectRepository ProjectRepository;
    private final  SprintRepository SprintRepository;

    @Override
    @Transactional
    public Projet addProject(Projet project) {
        Projet p = ProjectRepository.saveAndFlush(project);

        for (Sprint s : project.getSprintList()) {
            Sprint se = SprintRepository.saveAndFlush(s);
            se.setProjet(p);
        }
        return p;
    }
}
