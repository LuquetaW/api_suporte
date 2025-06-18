package com.crud.suporte.RESPOSTA.dto;

import com.crud.suporte.RESPOSTA.model.Resposta;

public record RespostaDTO(
    Long id,
    String mensagem,
    String dataResposta,
    Long usuarioId,
    Long chamadoId
) {
    public RespostaDTO(Resposta resposta) {
        this(
            resposta.getId(),
            resposta.getMensagem(),
            resposta.getDataResposta() != null ? resposta.getDataResposta().toString() : null,
            resposta.getUsuario() != null ? resposta.getUsuario().getId() : null,
            resposta.getChamado() != null ? resposta.getChamado().getId() : null
        );
    }
}