package com.lojaaguiar.projeto.service;

import com.lojaaguiar.projeto.entity.Acessos;
import com.lojaaguiar.projeto.repository.AcessosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessosService {
    @Autowired
    private AcessosRepository acessosRepository;

    public Acessos findByEmail(String email) {
        return acessosRepository.findByUsuarioEmail(email);
    }

}
