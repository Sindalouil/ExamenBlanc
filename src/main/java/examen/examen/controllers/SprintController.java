package examen.examen.controllers;

import examen.examen.entities.Sprint;
import examen.examen.services.ISprintServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sprint")
@RequiredArgsConstructor
public class SprintController {
    private final ISprintServiceImp sprintimp;
    @PostMapping()
    public void addSprint(@RequestBody Sprint sprint) {
        sprintimp.addSprint(sprint);
    }
}