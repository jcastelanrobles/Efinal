package com.example.Final.Services;

import com.example.Final.Entity.Persona;

import java.util.List;

public interface PersonaServ {
    public List<Persona> ConsultarPersona();

    public Persona CrearPersona(Persona persona);
    public Persona ModificarPersona(Persona persona);
    public Persona BuscarPersona(int id);
    public void EliminarPersona(int id);


}
