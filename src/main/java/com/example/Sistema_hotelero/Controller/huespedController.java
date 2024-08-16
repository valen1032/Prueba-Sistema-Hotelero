package com.example.Sistema_hotelero.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Huesped")
public class huespedController {

    @Autowired
    huespedServicio huespedServicio;
    @GetMapping("/all")
    public List<huespedModel> obtener(){
        return huespedServicio.obtener();

    }

    @GetMapping("/{id}")
    public Optional<huespedModel> obtenerPorId(@PathVariable int id) {
        return huespedServicio.obtenerPorId(id);

    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody huespedModel huesped){
        huespedServicio(huesped);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable int id){
        huespedServicio.eliminar(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizar(@RequestBody huespedDbo){
        huespedServicio.actualizar(huespedDbo);
    }

}
