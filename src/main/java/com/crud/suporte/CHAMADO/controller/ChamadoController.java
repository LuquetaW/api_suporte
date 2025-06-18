package com.crud.suporte.CHAMADO.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.suporte.CHAMADO.dto.ChamadoDTO;
import com.crud.suporte.CHAMADO.dto.ChamadoRequestDTO;
import com.crud.suporte.CHAMADO.model.Chamado;
import com.crud.suporte.CHAMADO.repository.ChamadoRepository;
import com.crud.suporte.STATUS.model.StatusChamado;
import com.crud.suporte.STATUS.repository.StatusChamadoRepository;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    private final ChamadoRepository chamadoRepository;
    private final StatusChamadoRepository statusChamadoRepository;

    public ChamadoController(ChamadoRepository chamadoRepository, StatusChamadoRepository statusChamadoRepository) {
        this.chamadoRepository = chamadoRepository;
        this.statusChamadoRepository = statusChamadoRepository;
    }

    @PostMapping
        public ChamadoDTO criarChamado(@RequestBody ChamadoRequestDTO dto) {
        StatusChamado status = statusChamadoRepository.findById(dto.status())
            .orElseThrow(() -> new RuntimeException("Status não encontrado"));

        Chamado chamado = new Chamado();
        chamado.setTitulo(dto.titulo());
        chamado.setDescricao(dto.descricao());
        chamado.setStatus(status);
        chamado.setPrioridade(dto.prioridade());
        chamado.setTipo(dto.tipo());
        chamado.setDataAbertura(dto.dataAbertura());
        chamado.setDataFechamento(dto.dataFechamento());
        chamado.setUsuarioId(dto.usuarioId());

        return new ChamadoDTO(chamadoRepository.save(chamado));
    }
    @GetMapping
    public List<Chamado> listarChamados() {
        return chamadoRepository.findAll();
    }
}
