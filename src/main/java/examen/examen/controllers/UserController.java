package examen.examen.controllers;

import examen.examen.entities.User;
import examen.examen.services.IUserServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserServiceImp user;

    @PostMapping()
    public void addUser(@RequestBody User ce) {
        user.addUser(ce);
    }

}
