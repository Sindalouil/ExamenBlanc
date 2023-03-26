package examen.examen.services;
import examen.examen.entities.Project;
import examen.examen.entities.User;
import examen.examen.repositories.ProjectRepository;
import examen.examen.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IUserServiceImp implements IUserService{
    private  final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    public User addUser (User user){
        return userRepository.save(user);
    }
    @Override
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User retrieveUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void removeUser(int id) {
        userRepository.deleteById(id);
    }
    @Override
    @Transactional
    public void assignProjectToClient(int projectId, String fname, String lname) {
        Project project = projectRepository.findById(projectId).orElse(null);
        User client = (User) userRepository.findByFnameAndLname(fname, lname).orElse(null);
        Assert.notNull(client, "User must be not null");
        Assert.notNull(project, "Project must be not null");
        client.getClient_projects().add(project);
        client.setClient_projects(client.getClient_projects());
    }
}
