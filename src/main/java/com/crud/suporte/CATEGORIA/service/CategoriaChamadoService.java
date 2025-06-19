package com.crud.suporte.CATEGORIA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.suporte.CATEGORIA.dto.CategoriaChamadoDTO;
import com.crud.suporte.CATEGORIA.model.CategoriaChamado;
import com.crud.suporte.CATEGORIA.repository.CategoriaChamadoRepository;

@Service
public class CategoriaChamadoService {

    @Autowired
    private CategoriaChamadoRepository repository;

    public List<CategoriaChamado> listarTodos() {
        return repository.findAll();
    }

    public Optional<CategoriaChamado> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public CategoriaChamado salvar(CategoriaChamadoDTO dto) {
        CategoriaChamado categoria = new CategoriaChamado();
        categoria.setNome(dto.getNome());
        categoria.setDescricao(dto.getDescricao());
        return repository.save(categoria);
    }

    public CategoriaChamado atualizar(Integer id, CategoriaChamadoDTO dto) {
        Optional<CategoriaChamado> existente = repository.findById(id);
        if (existente.isPresent()) {
            CategoriaChamado categoria = existente.get();
            categoria.setNome(dto.getNome());
            categoria.setDescricao(dto.getDescricao());
            return repository.save(categoria);
        } else {
            throw new RuntimeException("CategoriaChamado não encontrada com ID: " + id);
        }
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
}