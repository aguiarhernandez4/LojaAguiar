package com.lojaaguiar.projeto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;




import com.lojaaguiar.projeto.entity.Produtos;
import com.lojaaguiar.projeto.service.ProdutosService;

@RestController
public class ImagemController {

    @Autowired
    ProdutosService produtoService;

    @GetMapping("/produto/{id}/imagem")
    public ResponseEntity<byte[]> getImagem(@PathVariable int id) {
        Produtos produto = produtoService.getProdutoById(id);

        byte[] imagem = produto.getImagem();

        if (imagem == null) {
            return ResponseEntity.notFound().build();
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG); // fixo para JPG

        return new ResponseEntity<>(imagem, headers, HttpStatus.OK);
    }
}


