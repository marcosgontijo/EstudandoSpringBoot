package org.example.service;

import org.example.model.Cliente;
import org.example.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClienteRepository repository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);

    }

    public void validarCliente(Cliente cliente){

    }

}
