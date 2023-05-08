package com.portfolio.Backend.service;

import com.portfolio.Backend.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List <Persona> verPersonas();
    public void crearPersona (Persona per);
    public void modificarPersona (Persona per);

}
