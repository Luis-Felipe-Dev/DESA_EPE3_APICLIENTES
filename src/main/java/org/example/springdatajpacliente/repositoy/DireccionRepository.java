package org.example.springdatajpacliente.repositoy;

import org.example.springdatajpacliente.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {


}
