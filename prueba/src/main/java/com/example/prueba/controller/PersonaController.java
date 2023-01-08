package com.example.prueba.controller;

import com.example.prueba.model.Persona;
import com.example.prueba.services.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonaController {

    @Autowired
    PersonaService personaService;

    //rutas
    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersonas(){
        return (List<Persona>) personaService.listarPersonas();
    }

    @PostMapping("/persona")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona){
        return personaService.crearPersona(persona);

    }
    @DeleteMapping("/persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
    }
    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable Long id){
        return personaService.buscarPersonaPorId(id);
    }
    @PutMapping("/persona")
    public void modificarPersona(@RequestBody Persona persona){
        personaService.modificarPersona(persona);
    }

}
