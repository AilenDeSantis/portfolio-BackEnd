package com.portfolio.Backend.service;

import com.portfolio.Backend.model.Persona;
import com.portfolio.Backend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }
    
    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void modificarPersona(Persona per) {
        persoRepo.save(per);
    }
    
    
}
