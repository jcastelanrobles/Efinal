package com.example.Final.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Final.Entity.Persona;
import com.example.Final.Services.PersonaServIMPL.PersonaServIMPL;

@RestController
@RequestMapping("Crudrepo")
public class Controlador {
    @Autowired

    private PersonaServIMPL personaServIMPL;


    @PostMapping
    @RequestMapping (value = "CrearPersona", method = RequestMethod.POST)
    public ResponseEntity<?> CreaPersonas(@RequestBody Persona persona){
       Persona PersonaCreada=this.personaServIMPL.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);

    }
    @PutMapping
    @RequestMapping (value = "ModificarPersona", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersonas(@RequestBody Persona persona){
        Persona PersonaModificada=this.personaServIMPL.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaModificada);

    }
    @GetMapping
    @RequestMapping (value = "BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        Persona persona=this.personaServIMPL.BuscarPersona(id);
        return ResponseEntity.ok(persona);

    }
    @DeleteMapping
    @RequestMapping (value = "EliminarPersonas", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersonas(@PathVariable int id){
       this.personaServIMPL.EliminarPersona(id);
        return ResponseEntity.ok().build();

    }
}
