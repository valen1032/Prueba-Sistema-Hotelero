package com.example.Sistema_hotelero.Controller;

import com.example.Sistema_hotelero.Model.SedeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/Sedes")
public class sedeController {

    @Autowired
    sedeServicio sedeServicio;
    @GetMapping("/all")
    public List<SedeModel> obtener(){
        return sedeServicio.obtener();

    }

    @GetMapping("/{id}")
    public Optional<SedeModel> obtenerPorId(@PathVariable int id) {
        return sedeServicio.obtenerPorId(id);

    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody SedeModel sedeModel){
        personaService.crear(sedeModel);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable int id){
        sedeServicio.eliminar(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizar(@RequestBody sedeDbo sedeDbo){
        sedeServicio.actualizar(sedeDbo);
    }
}
