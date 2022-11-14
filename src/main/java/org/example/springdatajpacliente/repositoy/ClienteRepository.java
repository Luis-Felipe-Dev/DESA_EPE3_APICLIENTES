package org.example.springdatajpacliente.repositoy;

import org.example.springdatajpacliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findClienteByEmail(String email);

    List<Cliente> findClienteByDireccionCiudadDescripcion(String ciudad);

    List<Cliente> findClienteByDireccionPaisDescripcion(String pais);
}
