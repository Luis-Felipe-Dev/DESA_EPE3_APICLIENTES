package org.example.springdatajpacliente.service;

import org.example.springdatajpacliente.entity.Cliente;
import org.example.springdatajpacliente.repositoy.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    public void addCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    public Cliente findClienteByEmail(String email) {
        return clienteRepository.findClienteByEmail(email);
    }

    @Transactional
    public void updateCliente(Cliente cliente, String email) {

        Cliente clienteToUpdate = clienteRepository.findClienteByEmail(email);

        if (clienteToUpdate != null) {
            clienteToUpdate.setNombres(cliente.getNombres() != null ? cliente.getNombres() : clienteToUpdate.getNombres());
            clienteToUpdate.setApellidos(cliente.getApellidos() != null ? cliente.getApellidos() : clienteToUpdate.getApellidos());
            clienteToUpdate.setEmail(cliente.getEmail() != null ? cliente.getEmail() : clienteToUpdate.getEmail());
            clienteToUpdate.setDireccion(cliente.getDireccion() != null ? cliente.getDireccion() : clienteToUpdate.getDireccion());
        }
    }

    public Cliente deleteClienteByEmail(String email) {
        Cliente clienteToDelete = clienteRepository.findClienteByEmail(email);

        if (clienteToDelete != null) {
            clienteRepository.delete(clienteToDelete);
        }
        return clienteToDelete;
    }

    public List<Cliente> getByCiudad(String ciudad){
        return clienteRepository.findClienteByDireccionCiudadDescripcion(ciudad);
    }

    public List<Cliente> getByPais(String pais){
        return clienteRepository.findClienteByDireccionPaisDescripcion(pais);
    }

}
