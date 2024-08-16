package com.example.Sistema_hotelero.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class huespedServicio {

    @Autowired
    huespedRepository huespedRepository;
    public List<huespedModell> obtener() {
        return huespedRepository.findAll();
    }

    public Optional<huespedModel> obtenerPorId(int id) {
        return huespedRepository.findById(id);

    }

    public void crear(huespedModel huesped) {
        System.out.println(person.toString());
        if (!personRepository.existsById(huesped.getIdHuesped())){
           huespedRepository.save(huesped);
        }

    }


    public void eliminar(int id) {
        huespedRepository.deleteById(id);
    }

    public void actualizar(huespedDbo huespedDbo) {
        if (huespedRepository.existsById(huespedDbo.getIdHuesped())){
            PersonaModel person = personRepository.findById(huespedDbo.getIdHuesped()).get();
            person.setNombreCompleto(huespedDbo.getNombreCompleto());
            person.setCargo(huespedDbo.getCargo());
            person.setDireccion(huespedDbo.getDireccion());
            person.setGenero(huespedDbo.getGenero());
            person.setTelefono(huespedDbo.getTelefono());
            huespedRepository.save(person);
        }

    }

}
