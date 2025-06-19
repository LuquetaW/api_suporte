package com.crud.suporte.CATEGORIA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.suporte.CATEGORIA.model.CategoriaChamado;

@Repository
public interface CategoriaChamadoRepository extends JpaRepository<CategoriaChamado, Integer> {
}