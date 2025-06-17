package com.crud.suporte.STATUS.controller;

import com.crud.suporte.STATUS.model.StatusChamado;
import com.crud.suporte.STATUS.service.StatusChamadoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusChamadoController {

    private final StatusChamadoService service;

    public StatusChamadoController(StatusChamadoService service) {
        this.service = service;
    }

    @GetMapping
    public List<StatusChamado> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public StatusChamado criar(@RequestBody StatusChamado statusChamado) {
        return service.salvar(statusChamado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}




