package examen.examen.services;

import examen.examen.entities.Project;

import javax.transaction.Transactional;
import java.util.List;

public interface IProjectService {
    List<Project> retrieveAllProjects();
    Project updateProject(Project project);
    Project addProject(Project project) throws Exception;
    Project retrieveProject(int id);
    void removeProject(int id);
    void assignProjectToUser(int projectId, int userId);

    List<Project> getAllCurrentProjects();


}
