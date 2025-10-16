package com.lojaaguiar.projeto.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome", length = 40, nullable = false, unique = false)
    private String nome;
    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;
    @Column(name = "email", length = 30, nullable = false, unique = true)
    private String email;
    @Column(name = "password", length = 15, nullable = false, unique = false)
    private String password;
}
