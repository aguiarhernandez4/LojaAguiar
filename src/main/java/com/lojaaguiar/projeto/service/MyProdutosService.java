package com.lojaaguiar.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


import com.lojaaguiar.projeto.repository.MyProdutosRepository;
import com.lojaaguiar.projeto.entity.MyListProdutos;



@Service
public class MyProdutosService {
    @Autowired
    MyProdutosRepository myProdutosRepo;

    public void saveMyListProdutos(MyListProdutos p) {
        myProdutosRepo.save(p);
    }

    public List<MyListProdutos> getAllProdutos() {
        return myProdutosRepo.findAll();
    }

    public void deleteById(int id) {
        myProdutosRepo.deleteById(id);
    }

}
