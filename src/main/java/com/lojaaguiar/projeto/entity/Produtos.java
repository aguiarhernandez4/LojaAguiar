package com.lojaaguiar.projeto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produtos {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private String descricao;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imagem;

    public int getId(){return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name){this.name = name;}

    public int getPrice(){return price;}
    public void setPrice(int price) {this.price = price;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public byte[] getImagem() { return imagem; }
    public void setImagem(byte[] imagem){ this.imagem = imagem;}

    public Produtos(int id, String name, int price, String descricao, byte[] imagem) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public Produtos(){
        super();
    }


}
