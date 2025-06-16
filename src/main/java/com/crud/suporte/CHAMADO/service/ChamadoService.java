package com.crud.suporte.CHAMADO.service;

import org.springframework.stereotype.Service;

import com.crud.suporte.CHAMADO.dto.ChamadoDTO;
import com.crud.suporte.CHAMADO.model.Chamado;
import com.crud.suporte.CHAMADO.repository.ChamadoRepository;

@Service
public class ChamadoService {

    private final ChamadoRepository chamadoRepository;

    public ChamadoService(ChamadoRepository chamadoRepository) {
        this.chamadoRepository = chamadoRepository;
    }

    public ChamadoDTO criarChamado(Chamado chamado) {
        return new ChamadoDTO(chamadoRepository.save(chamado));
    }
}
