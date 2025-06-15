package com.crud.suporte.USUARIOS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.suporte.USUARIOS.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
