package com.lojaaguiar.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



import com.lojaaguiar.projeto.service.UsuarioService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.lojaaguiar.projeto.entity.Usuario;

@Controller  //Página que contém detalhes sobre o cadastramento de usuários
public class CadastroController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/saveuser")
    public String addUsuarios(@ModelAttribute Usuario u) {
        usuarioService.save(u);
        return "redirect:home";
    }

}