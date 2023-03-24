package examen.examen.controllers;

import examen.examen.services.IProjectServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projet")
@RequiredArgsConstructor
public class ProjetController {
    private final IProjectServiceImp projetimp;
    @PostMapping()
    public Projet addProjet(@RequestBody Projet projet) {
        return projetimp.addProject(projet);
    }
}
