package com.lojaaguiar.projeto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestLoginDTO {

    @NotBlank(message = "O nome não pode estar vazio.")
    private String name;

    @NotBlank(message = "O CPF não podes estar vazio")
    @Size(min = 11, max = 11)
    private String cpf;


    @Email(message = "Email inválido")
    @NotBlank(message = "O email é obrigatório")
    private String email;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 8, message = "A senha deve conter no mínimo 8 carcteres.")
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).*$",
            message = "A senha deve conter letras maiúsculas, minúsculas e números"
    )
    private String password;



}
