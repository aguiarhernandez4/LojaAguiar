package com.lojaaguiar.projeto.repository;

import com.lojaaguiar.projeto.entity.Acessos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessosRepository extends JpaRepository<Acessos, Integer> {
    Acessos findByUsuarioEmail(String email);
}
