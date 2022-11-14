package org.example.springdatajpacliente.service;

import org.example.springdatajpacliente.entity.Pais;
import org.example.springdatajpacliente.repositoy.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public void addPais(Pais pais) {
        paisRepository.save(pais);
    }

    public List<Pais> getAllPaises() {
        return paisRepository.findAll();
    }

    public List<Pais> findByDescripcion(String descripcion) {

        List<Pais> pais = paisRepository.findPaisByDescripcion(descripcion);

        if (pais.isEmpty()) {
            return null;
        } else {
            return paisRepository.findPaisByDescripcion(descripcion);
        }
    }
}

