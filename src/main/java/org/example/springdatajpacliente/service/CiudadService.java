package org.example.springdatajpacliente.service;

import org.example.springdatajpacliente.entity.Ciudad;
import org.example.springdatajpacliente.repositoy.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

    public void addCiudad(Ciudad ciudad) {
        ciudadRepository.save(ciudad);
    }

    public List<Ciudad> getAllCiudades() {
        return ciudadRepository.findAll();
    }

    public List<Ciudad> findByDescripcion(String descripcion){

        List<Ciudad> ciudad = ciudadRepository.findCiudadByDescripcion(descripcion);

        if(ciudad.isEmpty()){
            return null;
        }else{
            return ciudadRepository.findCiudadByDescripcion(descripcion);
        }
    }
}
