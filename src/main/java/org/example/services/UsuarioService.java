package org.example.services;

import org.example.entities.Usuario;
import org.example.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;


    //retorna todos os usuarios
    public List<Usuario> findAll()  {
        return repository.findAll();
    }

    //retorna o usuario pelo id
    public Optional<Usuario> findById(Long id)  {
        return repository.findById(id);
    }

    //inserir usuario
    public Usuario insert(Usuario usuario)  {
        return repository.save(usuario);
    }

    //deletar usuario
    public void delete(Long id) {
        repository.deleteById(id);
    }

    //update usuario - atualizar usuario
    public boolean update(Long id, Usuario usuario) {
        Optional<Usuario> optional = repository.findById(id);
        if (optional.isPresent())   {
            Usuario usuario1 = optional.get();
            usuario1.setNome(usuario.getNome());
            usuario1.setIdade(usuario.getIdade());
            repository.save(usuario1);
            return true;
        }
        return false;
    }


}
