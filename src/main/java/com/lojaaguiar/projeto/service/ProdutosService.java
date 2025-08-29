package com.lojaaguiar.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


import com.lojaaguiar.projeto.repository.ProdutosRepository;
import com.lojaaguiar.projeto.entity.Produtos;
@Service
public class ProdutosService {
    @Autowired
    ProdutosRepository produtosRepo;

    public void save(Produtos p) {
        produtosRepo.save(p);
    }
    
    public List<Produtos> getAllProdutos() {
        return produtosRepo.findAll();
    }


    public Produtos getProdutosById(int id) {
        return produtosRepo.findById(id).get();
    }

    public void deleteProdutosById(int id) {
        produtosRepo.deleteById(id);
    }

}
