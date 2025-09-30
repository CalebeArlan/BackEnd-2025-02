package com.example.exemplo_repositorio.repositories;

import com.example.exemplo_repositorio.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JogadorRepository extends JpaRepository<Jogador, UUID> {

    Optional<Jogador> findByNome(String nome);
    Optional<Jogador> deleteByNome(String nome);

}
