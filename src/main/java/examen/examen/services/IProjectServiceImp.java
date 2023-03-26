package examen.examen.services;

import examen.examen.entities.Project;
import examen.examen.entities.Sprint;
import examen.examen.entities.User;
import examen.examen.repositories.ProjectRepository;
import examen.examen.repositories.SprintRepository;
import examen.examen.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class IProjectServiceImp implements IProjectService {
    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    @Override
    public Project addProject(Project project) {
        Assert.isNull(project.getSprint(),"project must have at least one sprint");
        Assert.notEmpty(project.getSprint(),"project must have at least one sprint");
        projectRepository.saveAndFlush(project);
        project.getSprints().forEach((s) -> {
            s.setProject(project);
        });
        return project;

    }

    @Override
    public Project retrieveProject(int id) {
        return projectRepository.findById(id).orElse(null);
    }

    @Override
    public void removeProject(int id) {
        projectRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void assignProjectToUser(int projectId, int userId) {
        Project project = projectRepository.findById(projectId).orElse(null);
        User user = userRepository.findById(userId).orElse(null);
        Assert.notNull(user, "User must be not null");
        Assert.notNull(project, "Project must be not null");
        user.getProjects().add(project);
        user.setProjects(user.getProjects());
    }


}
