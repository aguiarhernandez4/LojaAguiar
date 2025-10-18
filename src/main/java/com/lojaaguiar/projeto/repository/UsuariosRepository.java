package com.lojaaguiar.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaaguiar.projeto.entity.Usuario;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Integer>{
    <Usuario>

    Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByCpf(String cpf);

}
