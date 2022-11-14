package org.example.springdatajpacliente.repositoy;

import org.example.springdatajpacliente.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
    List<Pais> findPaisByDescripcion(String descripcion);
}
