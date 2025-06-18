package com.crud.suporte.CHAMADO.dto;

public record ChamadoRequestDTO(
    String titulo,
    String descricao,
    Long status, // só o ID, não o objeto inteiro
    String prioridade,
    String tipo,
    String dataAbertura,
    String dataFechamento,
    Long usuarioId
) {}