package com.MotoApp.moto.controlador;

import com.MotoApp.moto.modelo.Moto;
import com.MotoApp.moto.repository.IMotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/motos")
public class MotoController {
    @Autowired
    private IMotoRepository motoRepository;

    @GetMapping
    public List<Moto> obtenerMotos() {
        return motoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Moto obtenerMotoPorId(@PathVariable Long id) {
        return motoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Moto crearMoto(@RequestBody Moto moto) {
        return motoRepository.save(moto);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarMoto(@PathVariable Long id) {
        motoRepository.deleteById(id);
    }
}

