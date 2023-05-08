package com.portfolio.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombre; 
    private String apellido;
    private String domicilio; 
    private String fechaNac;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private String url_foto;
    private String url_linkedin;
    private String url_insta;
    private String url_git;
    private String rol;
    
    
    public Persona(){}
    
    public Persona(Long id, String nombre, String apellido, String domicilio, String fechaNac,
                   String telefono, String correo, String sobre_mi, String url_foto, String url_linkedin,
                   String url_insta, String url_git, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.url_linkedin = url_linkedin;
        this.url_insta = url_insta;
        this.url_git = url_git;
        this.rol = rol;
    }
    
}
