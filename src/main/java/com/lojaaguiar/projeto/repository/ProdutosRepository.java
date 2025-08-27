package com.lojaaguiar.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaaguiar.projeto.entity.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {

}
