package org.example.springdatajpacliente.controller;

import org.example.springdatajpacliente.entity.Ciudad;
import org.example.springdatajpacliente.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @PostMapping("/add")
    public void addCiudad(@RequestBody Ciudad ciudad) {
        ciudadService.addCiudad(ciudad);
    }

    @GetMapping({"/", "/getall"})
    public List<Ciudad> getAllCiudades() {
        return ciudadService.getAllCiudades();
    }

    @GetMapping("/findbyciudad")
    public List<Ciudad> findByDescripcion(@RequestParam String descripcion){
        return ciudadService.findByDescripcion(descripcion);
    }

}