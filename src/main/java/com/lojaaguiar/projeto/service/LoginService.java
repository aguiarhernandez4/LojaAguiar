package com.lojaaguiar.projeto.service;

import com.lojaaguiar.projeto.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UsuariosRepository usuariosRepo;

    public void vazio(){

    }


}
