package com.example.prueba.services;

import com.example.prueba.model.Persona;
import com.example.prueba.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;


    public Iterable<Persona> listarPersonas() {
        return personaRepository.findAll();


    }

    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);

    }

    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);

    }

    public Persona buscarPersonaPorId(Long id) {
        return personaRepository.findById(id).orElse(null);

    }

    public void modificarPersona(Persona persona) {
        personaRepository.save(persona);



    }
}
