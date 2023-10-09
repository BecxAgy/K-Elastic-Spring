package proj.v1.kelastic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proj.v1.kelastic.entities.Projeto;
import proj.v1.kelastic.services.ProjetoService;

@RestController
@RequestMapping("/api")
public class ProjetoController {

    @Autowired
    private ProjetoService pjService;

    @GetMapping("/findAll")
    public Iterable<Projeto> findAll(){
        return pjService.getAll();
    }
}
