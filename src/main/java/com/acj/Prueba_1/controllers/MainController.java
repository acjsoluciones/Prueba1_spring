
package com.acj.Prueba_1.controllers;

import com.acj.Prueba_1.dto.Persona;
import com.acj.Prueba_1.dto.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class MainController {
    @Autowired
    PersonaService service;

    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }

}

