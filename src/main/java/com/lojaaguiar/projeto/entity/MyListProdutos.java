package com.lojaaguiar.projeto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyListProdutos {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private String descricao;

    public int getId(){return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name){this.name = name;}

    public int getPrice(){return price;}
    public void setPrice(int price) {this.price = price;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public MyListProdutos(int id, String name, int price, String descricao) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.descricao = descricao;
    }

    public MyListProdutos(){
        super();
    }
}
