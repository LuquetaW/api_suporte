package com.crud.suporte.RESPOSTA.model;


import java.time.LocalDateTime;

import com.crud.suporte.CHAMADO.model.Chamado;
import com.crud.suporte.USUARIOS.model.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "tb_respostas")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2000)
    private String mensagem;

    @Column(nullable = false)
    private LocalDateTime dataResposta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chamado_id", nullable = false)
    private Chamado chamado;
    
    public Resposta(String mensagem, LocalDateTime dataResposta, Usuario usuario, Chamado chamado) {
        this.mensagem = mensagem;
        this.dataResposta = dataResposta;
        this.usuario = usuario;
        this.chamado = chamado;
    }
}
