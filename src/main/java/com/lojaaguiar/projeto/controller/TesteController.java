package com.lojaaguiar.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teste")
public class TesteController { //Controller dedicado apenas aos testes
    @GetMapping("/testando")
    public String teste(){
        return "teste";
    }

    @GetMapping
    public String texto(Model model){
        model.addAttribute("mensagem","Hello World");
        return "/teste";
    }


}
