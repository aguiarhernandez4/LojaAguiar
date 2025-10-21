package com.lojaaguiar.projeto.controller;

import com.lojaaguiar.projeto.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import com.lojaaguiar.projeto.service.ProdutosService;
import com.lojaaguiar.projeto.entity.Produtos;


@Controller
public class ProdutosController {
    @Autowired
    private ProdutosService produtoService;

    @Autowired
    private ProdutosRepository produtoRepo;

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

    @RequestMapping("/deleteproduto/{id}")
    public String deleteProdutoById(@PathVariable("id")int id) {
        produtoService.deleteProdutosById(id);
        return "redirect:/mostrarprodutos";
    }

    @RequestMapping("/editproduto/{id}")
    public String editProduto(@PathVariable("id") int id, Model model) {
        Produtos p = produtoService.getProdutoById(id);
        model.addAttribute("produto", p);
        return "editproduto";
    }


    @GetMapping("/imagem/{id}")
    public ResponseEntity<byte[]> getImagem(@PathVariable int id){
        Produtos produto = produtoRepo.findById(id).orElse(null);

        if (produto == null || produto.getImagem() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(produto.getImagem());
    }

}
