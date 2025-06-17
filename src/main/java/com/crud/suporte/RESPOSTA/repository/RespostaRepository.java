package com.crud.suporte.RESPOSTA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.suporte.RESPOSTA.model.Resposta;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Long> {
}