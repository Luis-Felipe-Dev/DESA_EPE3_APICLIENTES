package org.example.springdatajpacliente.controller;

import org.example.springdatajpacliente.entity.Direccion;
import org.example.springdatajpacliente.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/direccion")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;

    @PostMapping("/add")
    public void addDireccion(@RequestBody Direccion direccion) {
        direccionService.addDireccion(direccion);
    }

    @GetMapping({"/", "getall"})
    public List<Direccion> getAllDirecciones() {
        return direccionService.getAllDirecciones();
    }

}
