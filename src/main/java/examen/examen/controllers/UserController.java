package examen.examen.controllers;

import examen.examen.entities.User;
import examen.examen.services.IUserService;
import examen.examen.services.IUserServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserServiceImp iUserServiceImp;
    private IUserService iUserService;

    @GetMapping("/users")
    public List<User> getAllUsers(){return iUserService.retrieveAllUsers();}

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){return iUserService.retrieveUser(id);}

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {return iUserService.addUser(user);}

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){return iUserService.updateUser(user);}

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){iUserService.removeUser(id);}

    @PutMapping("/assignProjectUser/{projectId}/{userId}")
    public void assignProjectToUser(@PathVariable int projectId, @PathVariable int userId){
        iUserService.assignProjectToUser(projectId,userId);
    }

    @PutMapping("/assignProjectClient/{projectId}/{fname}/{lname}")
    public void assignProjectToClient(@PathVariable int projectId, @PathVariable String fname,@PathVariable String lname){
        iUserService.assignProjectToClient(projectId,fname,lname);
    }

}
