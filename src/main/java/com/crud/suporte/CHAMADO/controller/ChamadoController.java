package com.crud.suporte.CHAMADO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.suporte.CHAMADO.dto.ChamadoDTO;
import com.crud.suporte.CHAMADO.model.Chamado;
import com.crud.suporte.CHAMADO.repository.ChamadoRepository;
import com.crud.suporte.CHAMADO.service.ChamadoService;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    private final ChamadoRepository chamadoRepository;

    @Autowired
    private ChamadoService chamadoService;

    @Autowired
    public ChamadoController(ChamadoRepository chamadoRepository) {
        this.chamadoRepository = chamadoRepository;
    }

    @PostMapping
    public ChamadoDTO criarChamado(@RequestBody Chamado chamado) {
        return new ChamadoDTO(chamadoRepository.save(chamado));
    }
}
