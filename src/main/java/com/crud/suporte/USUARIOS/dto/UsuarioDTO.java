package com.crud.suporte.USUARIOS.dto;

import com.crud.suporte.USUARIOS.model.Usuario;

public record UsuarioDTO(
    Long id,
    String nome,
    String email) {

        public UsuarioDTO(Usuario usuario){
            this(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
            );
        }
}
