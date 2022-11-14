package org.example.springdatajpacliente.controller;

import org.example.springdatajpacliente.entity.Pais;
import org.example.springdatajpacliente.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @PostMapping("/add")
    public void addPais(@RequestBody Pais pais) {
        paisService.addPais(pais);
    }

    @GetMapping({"/", "getall"})
    public List<Pais> getAllPaises() {
        return paisService.getAllPaises();
    }

    @GetMapping("/findbypais")
    public List<Pais> findByDescripcion(@RequestParam String descripcion){
        return paisService.findByDescripcion(descripcion);
    }

}
