package com.crud.suporte.USUARIOS.service;

import org.springframework.stereotype.Service;

import com.crud.suporte.USUARIOS.dto.UsuarioDTO;
import com.crud.suporte.USUARIOS.model.Usuario;
import com.crud.suporte.USUARIOS.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioDTO criarUsuario(Usuario usuario){
        return new UsuarioDTO(usuarioRepository.save(usuario));
    }

    public UsuarioDTO buscarUsuarioPorId(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
        return new UsuarioDTO(usuario);
    }
}
