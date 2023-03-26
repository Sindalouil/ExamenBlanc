package examen.examen.services;

import examen.examen.entities.User;

import javax.transaction.Transactional;
import java.util.List;

public interface IUserService {
    List<User> retrieveAllUsers();
    User updateUser(User user);
    User addUser(User user);
    User retrieveUser(int id);
    void removeUser(int id);

    @Transactional
    void assignProjectToClient(int projectId, String fname, String lname);

    void assignProjectToUser(int projectId, int userId);
}
