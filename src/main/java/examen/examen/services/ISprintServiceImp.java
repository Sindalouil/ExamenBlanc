package examen.examen.services;

import examen.examen.entities.Sprint;
import examen.examen.repositories.SprintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ISprintServiceImp implements ISprintService{
    private  final SprintRepository sprintRepository;

    @Override
    public Sprint addSprint(Sprint sprint) {
        return sprintRepository.save(sprint);
    }

    @Override
    public List<Sprint> retrieveAllSprints() {
        return sprintRepository.findAll();
    }

    @Override
    public Sprint updateSprint(Sprint sprint) {
        return sprintRepository.save(sprint);
    }
    @Override
    public Sprint retrieveSprint(Integer id) {
        return sprintRepository.findById(id).orElse(null);
    }

    @Override
    public void removeSprint(Integer id) {
        sprintRepository.deleteById(id);
    }
}
