package com.lojaaguiar.projeto.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProdutosCreateDTO {
    @NotBlank(message = "O nome do produto é obrigatório")
    private String nome;

    @NotBlank(message = "A descrição do produto é obrigatória")
    private String descricao;

    @NotNull(message = "O preço é obrigatório")
    @Positive(message = "O preço deve serm maior que zero")
    private Double preco;


    @NotNull(message = "Você precisa adicionar uma imagem")
    @NotBlank(message = "Você precisa adicionar uma imagem")
    private byte[] imagem;
}
