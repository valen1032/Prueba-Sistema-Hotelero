package com.example.Sistema_hotelero.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class sedeServicio {
    @Autowired
    PersonRepository personRepository;
    public List<PersonaModel> obtener() {
        return personRepository.findAll();
    }

    public Optional<PersonaModel> obtenerPorId(int id) {
        return personRepository.findById(id);

    }

    public void crear(PersonaModel person) {
        System.out.println(person.toString());
        if (!personRepository.existsById(person.getIdPersona())){
            personRepository.save(person);
        }

    }


    public void eliminar(int id) {
        personRepository.deleteById(id);
    }

    public void actualizar(PersonaDbo personaDbo) {
        if (personRepository.existsById(personaDbo.getIdPersona())){
            PersonaModel person = personRepository.findById(personaDbo.getIdPersona()).get();
            person.setNombreCompleto(personaDbo.getNombreCompleto());
            person.setCargo(personaDbo.getCargo());
            person.setDireccion(personaDbo.getDireccion());
            person.setGenero(personaDbo.getGenero());
            person.setTelefono(personaDbo.getTelefono());
            personRepository.save(person);
        }

    }
}
