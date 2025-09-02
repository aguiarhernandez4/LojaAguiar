package com.lojaaguiar.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaaguiar.projeto.entity.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Integer>{

}
