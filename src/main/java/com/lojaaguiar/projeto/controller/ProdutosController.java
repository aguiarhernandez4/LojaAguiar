package com.lojaaguiar.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.lojaaguiar.projeto.service.ProdutosService;
import com.lojaaguiar.projeto.entity.Produtos;
@Controller
public class ProdutosController {
    @Autowired
    ProdutosService produtoService;

    @PostMapping("/save")
    public String addProdutos(@ModelAttribute Produtos p) {
        produtoService.save(p);
        return "redirect:produtos";
    }

    @GetMapping("/mostrarprodutos")
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoService.getAllProdutos());
        return "produtos";
    }
}
