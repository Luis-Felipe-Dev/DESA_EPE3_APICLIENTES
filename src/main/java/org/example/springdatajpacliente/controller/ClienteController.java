package org.example.springdatajpacliente.controller;

import org.example.springdatajpacliente.entity.Cliente;
import org.example.springdatajpacliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/add")
    public void addCliente(@RequestBody Cliente cliente) {
        clienteService.addCliente(cliente);
    }

    @GetMapping({"/", "/getall"})
    public List<Cliente> getAll() {
        return clienteService.getAll();
    }

    @GetMapping("/getbyemail")
    public Cliente findByEmail(@RequestParam String email) {
        return clienteService.findClienteByEmail(email);
    }


    @PostMapping("/updatecliente")
    public void updateCliente(@RequestParam String email, @RequestBody Cliente cliente) {
        clienteService.updateCliente(cliente, email);
    }

    @PostMapping("/deletebyemail")
    public Cliente deleteByEmail(@RequestParam String email) {
        return clienteService.deleteClienteByEmail(email);
    }

    @GetMapping("/getbyciudad")
    public List<Cliente> getByCiudad(@RequestParam String ciudad) {
        return clienteService.getByCiudad(ciudad);
    }

    @GetMapping("/getbypais")
    public List<Cliente> getByPais(@RequestParam String pais) {
        return clienteService.getByPais(pais);
    }


}
