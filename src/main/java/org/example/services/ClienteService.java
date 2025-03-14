package org.example.services;

import org.example.entities.Cliente;
import org.example.entities.Usuario;
import org.example.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;


    public List<Cliente> findAll()  {
        return repository.findAll();
    }


    public Optional<Cliente> findById(Long id)  {
        return repository.findById(id);
    }

    public Cliente insert(Cliente cliente)  {
        return repository.save(cliente);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public boolean update(Long id, Cliente cliente) {
        Optional<Cliente> optional = repository.findById(id);
        if (optional.isPresent())   {
            Cliente cliente1 = optional.get();
            cliente1.setNome(cliente.getNome());
            cliente1.setCpf(cliente.getCpf());
            cliente1.setData_nascimeto(cliente.getData_nascimeto());
            cliente1.setForma_pagamento(cliente.getForma_pagamento());
            repository.save(cliente1);
            return true;
        }
        return false;
    }


}
