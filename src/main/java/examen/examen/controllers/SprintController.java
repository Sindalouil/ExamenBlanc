package examen.examen.controllers;

import examen.examen.entities.Sprint;
import examen.examen.repositories.SprintRepository;
import examen.examen.services.ISprintService;
import examen.examen.services.ISprintServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sprint")
@RequiredArgsConstructor
public class SprintController {
    private final ISprintServiceImp sprintimp;

    @Autowired
    private SprintRepository sprintRepository;
    private ISprintService iSprintService;

    @GetMapping("/sprints")
    public List<Sprint> getAllSprints(){return iSprintService.retrieveAllSprints();}

    @GetMapping("/sprints/{id}")
    public Sprint getSprint(@PathVariable int id){return iSprintService.retrieveSprint(id);}

    @PostMapping("/sprints")
    public Sprint createSprint(@RequestBody Sprint sprint) {return iSprintService.addSprint(sprint);}

    @PutMapping("/sprints")
    public Sprint updateSprint(@RequestBody Sprint sprint){return iSprintService.updateSprint(sprint);}

    @DeleteMapping("/sprints/{id}")
    public void deleteSprint(@PathVariable int id){ iSprintService.removeSprint(id);}
}