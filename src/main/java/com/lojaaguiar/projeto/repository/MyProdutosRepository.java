package com.lojaaguiar.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaaguiar.projeto.entity.MyListProdutos;


@Repository
public interface MyProdutosRepository extends JpaRepository<MyListProdutos, Integer> {

}
