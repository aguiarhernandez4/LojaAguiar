package com.lojaaguiar.projeto.controller;


import com.lojaaguiar.projeto.entity.Produtos;
import com.lojaaguiar.projeto.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagens")
public class ImagemController {

    @Autowired
    private ProdutosRepository produtoRepository;

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getImagem(@PathVariable int id){
        Produtos produto = produtoRepository.findById(id).orElse(null);

        if (produto == null || produto.getImagem() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "image/jpeg");
        return new ResponseEntity<>(produto.getImagem(), headers, HttpStatus.OK);
    }

}
