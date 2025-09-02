package com.lojaaguiar.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


import com.lojaaguiar.projeto.entity.Usuario;
import com.lojaaguiar.projeto.repository.UsuariosRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuariosRepository usuariosRepo;


    public void save(Usuario u) {
        usuariosRepo.save(u);
    }

    public List<Usuario> getAllUsuarios() {
        return usuariosRepo.findAll();
    }

    public Usuario getUsuariosById(int id) {
        return usuariosRepo.findById(id).get();
    }

    public void deleteUsuariosById(int id) {
        usuariosRepo.deleteById(id);
    }
}
