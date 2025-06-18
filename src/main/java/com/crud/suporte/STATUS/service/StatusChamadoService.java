
package com.crud.suporte.STATUS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crud.suporte.STATUS.model.StatusChamado;
import com.crud.suporte.STATUS.repository.StatusChamadoRepository;

@Service
public class StatusChamadoService {

    private final StatusChamadoRepository repository;

    public StatusChamadoService(StatusChamadoRepository repository) {
        this.repository = repository;
    }

    public List<StatusChamado> listarTodos() {
        return repository.findAll();
    }

    public Optional<StatusChamado> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public StatusChamado salvar(StatusChamado statusChamado) {
        return repository.save(statusChamado);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

