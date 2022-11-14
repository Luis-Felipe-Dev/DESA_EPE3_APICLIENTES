package org.example.springdatajpacliente.service;

import org.example.springdatajpacliente.entity.Direccion;
import org.example.springdatajpacliente.repositoy.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    public void addDireccion(Direccion direccion){
        direccionRepository.save(direccion);
    }

    public List<Direccion> getAllDirecciones(){
        return direccionRepository.findAll();
    }
}
