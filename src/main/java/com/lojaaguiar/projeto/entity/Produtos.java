package com.lojaaguiar.projeto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Produtos {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;
    private String descricao;

    public int getId(){
        return id;
    }

}
