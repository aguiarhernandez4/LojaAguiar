package com.lojaaguiar.projeto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.lojaaguiar.projeto.service.ProdutosService;

@RestController
public class ImagemController {

    @Autowired
    ProdutosService produtoService;



}
