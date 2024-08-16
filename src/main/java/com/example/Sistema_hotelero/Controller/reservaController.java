package com.example.Sistema_hotelero.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reserva")

public class reservaController {

    @Autowired
    reservaServicio reservaServicio;
    @GetMapping("/all")
    public List<reservaModel> obtener(){
        return reservaServicio.obtener();

    }

    @GetMapping("/{id}")
    public Optional< reservaModel > obtenerPorId(@PathVariable int id) {
        return reservaServicio.obtenerPorId(id);

    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody reservaModel person){
        reservaServicio.crear(person);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable int id){
        reservaServicio.eliminar(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizar(@RequestBody reservaDbo reservaDbo){
        reservaServicio.actualizar(reservaDbo);
    }

}
