

package com.crud.suporte.STATUS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusChamadoDTO {
    private Long id;
    private String nome;
    private String descricao;
}
