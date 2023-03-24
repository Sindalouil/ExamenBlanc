package examen.examen.services;

import examen.examen.entities.Sprint;
import examen.examen.repositories.SprintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ISprintServiceImp {
    private  final SprintRepository sprintRepository;

    @Override
    public Sprint addSprint(Sprint Sprint) {
        return sprintRepository.save(Sprint);
    }
}
