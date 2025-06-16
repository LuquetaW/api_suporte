package com.crud.suporte.CHAMADO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.suporte.CHAMADO.model.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
