package com.crud.suporte.CHAMADO.model;

import com.crud.suporte.STATUS.model.StatusChamado;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_chamados")
public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String titulo;
    public String descricao;

    // public String status; transformar em entidade
    @OneToOne
    @JoinColumn(name = "id_status")
    @JsonManagedReference
    public StatusChamado status;

    public String prioridade;
    public String tipo;
    public String dataAbertura;
    public String dataFechamento;
    private Long usuarioId;
}
