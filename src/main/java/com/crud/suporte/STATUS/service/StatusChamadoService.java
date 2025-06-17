
package com.crud.suporte.STATUS.service;

import com.crud.suporte.STATUS.model.StatusChamado;
import com.crud.suporte.STATUS.repository.StatusChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusChamadoService {

    private final StatusChamadoRepository repository;

    @Autowired
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

