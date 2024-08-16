package com.example.Sistema_hotelero.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class reservaServicio {
    @Autowired
    reservaRepository reservaRepository;
    public List<reservaModel> obtener() {
        return personRepository.findAll();
    }

    public Optional<reservaModel> obtenerPorId(int id) {
        return reservaRepository.findById(id);

    }

    public void crear(reservaModel reserva) {
        System.out.println(reserva.toString());
        if (!reservaRepository.existsById(reserva.getIdPersona())){
            reservaRepository.save(reserva);
        }

    }


    public void eliminar(int id) {
        reservaRepository.deleteById(id);
    }

    public void actualizar(reservaDbo reservaDbo) {
        if (reservaRepository.existsById(reservaDbo.getIdPersona())){
            reservaModel reserva = reservaRepository.findById(personaDbo.getIdPersona()).get();
            reserva.setNombreCompleto(personaDbo.getNombreCompleto());
            reserva.setCargo(reservaDbo.getCargo());
            reserva.setDireccion(reservaDbo.getDireccion());
            reserva.setGenero(reservaDboo.getGenero());
            reserva.setTelefono(reservaDbo.getTelefono());
            reservaRepository.save(reserva);
        }

    }
}
