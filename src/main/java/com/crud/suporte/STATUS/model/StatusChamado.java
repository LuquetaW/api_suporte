
package com.crud.suporte.STATUS.model;


import com.crud.suporte.CHAMADO.model.Chamado;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "status_chamado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StatusChamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @OneToOne(mappedBy = "status") // apontando para o atributo da classe em questão
    @JsonBackReference
    private Chamado chamado;
}
