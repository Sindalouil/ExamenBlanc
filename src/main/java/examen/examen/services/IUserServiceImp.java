package examen.examen.services;
import examen.examen.entities.User;
import examen.examen.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IUserServiceImp {
    private  final UserRepository userRepository;
    public User addUser (User user){
        return UserRepository.save(user);
    }
}
