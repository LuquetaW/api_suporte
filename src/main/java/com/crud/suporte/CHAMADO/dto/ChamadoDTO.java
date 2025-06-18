package com.crud.suporte.CHAMADO.dto;

import com.crud.suporte.CHAMADO.model.Chamado;

public record ChamadoDTO(
    Long id,
    String titulo,
    String descricao,
    Long status,
    String prioridade,
    String tipo,
    String dataAbertura,
    String dataFechamento,
    Long usuarioId) {
        
        public ChamadoDTO(Chamado chamado) {
            this(
                chamado.getId(),
                chamado.getTitulo(),
                chamado.getDescricao(),
                chamado.getStatus() != null ? chamado.getStatus().getId() : null,
                chamado.getPrioridade(),
                chamado.getTipo(),
                chamado.getDataAbertura() != null ? chamado.getDataAbertura().toString() : null,
                chamado.getDataFechamento() != null ? chamado.getDataFechamento().toString() : null,
                chamado.getUsuarioId() != null ? chamado.getUsuarioId() : null
            );
        }

}
