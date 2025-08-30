package com.lojaaguiar.projeto.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.lojaaguiar.projeto.repository.ProdutosRepository;
import com.lojaaguiar.projeto.service.ProdutosService;


@Controller
public class MostrarProdutosController {

    @Autowired
    ProdutosRepository produtosRepo;

    @Autowired
    ProdutosService produtosService;


    @GetMapping("/nossosprodutos")
    public String ListarProdutos(Model model) {
        List<produtos> produtos = produtosService.getAllProdutos();
        model.addAttribute("produtos", produtos);
        return "produtos";
    }


}
