package com.crud.suporte.USUARIOS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.suporte.EXCEPTIONS.NaoEncontradoException;
import com.crud.suporte.USUARIOS.dto.UsuarioDTO;
import com.crud.suporte.USUARIOS.model.Usuario;
import com.crud.suporte.USUARIOS.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public UsuarioDTO criarUsuario(Usuario usuario){
        return new UsuarioDTO(usuarioRepository.save(usuario));
    }

    @Transactional
    public UsuarioDTO buscarUsuarioPorId(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o ID: " + id));
        return new UsuarioDTO(usuario);
    }

    @Transactional
    public List<UsuarioDTO> listarUsuarios() {
        return usuarioRepository.findAll()
                                .stream()
                                .map(usuario -> new UsuarioDTO(usuario)).toList();
    }

    @Transactional
    public UsuarioDTO deletarUsuario(Long id){
        Usuario usuarioEncontrado = usuarioRepository.findById(id).orElseThrow(() -> new NaoEncontradoException("Usuário com id " + id + " não foi encontrado no banco!"));
        if (usuarioEncontrado != null) {
            usuarioRepository.deleteById(id);
        }
        return null;
    }
}
