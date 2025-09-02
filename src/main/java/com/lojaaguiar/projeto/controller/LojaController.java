package com.lojaaguiar.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lojaaguiar.projeto.service.ProdutosService;


@Controller
public class LojaController {
    @Autowired
    ProdutosService produtoService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/produtos")
    public String produtos() {
        return "produtos";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/cadastroproduto")
    public String cadastro_produto() {
        return "cadastroproduto";
    }

    
}

