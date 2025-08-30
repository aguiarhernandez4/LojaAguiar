package com.lojaaguiar.projeto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.ui.Model;

import com.lojaaguiar.projeto.service.MyProdutosService;
import com.lojaaguiar.projeto.service.ProdutosService;
import com.lojaaguiar.projeto.entity.Produtos;
import com.lojaaguiar.projeto.repository.MyProdutosRepository;
import com.lojaaguiar.projeto.repository.ProdutosRepository;

@Controller
public class ProdutosController {
    @Autowired
    ProdutosService produtoService;

    @Autowired
    MyProdutosService MyProdutosListService;

    @Autowired
    MyProdutosRepository myProdutosRepo;

    @Autowired
    ProdutosRepository Produtos;

    @PostMapping("/save")
    public String addProdutos(@ModelAttribute Produtos p) {
        produtoService.save(p);
        return "redirect:produtos";
    }

    @RequestMapping("/deleteprodutos/{id}")    
    public String getMyList(@PathVariable("id") int id) {
        produtoService.deleteProdutosById(id);
        return "redirect:/produtos";
    }
}
