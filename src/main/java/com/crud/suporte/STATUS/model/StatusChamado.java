
package com.crud.suporte.STATUS.model;


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
}
