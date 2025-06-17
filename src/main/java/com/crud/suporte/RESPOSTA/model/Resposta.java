package com.crud.suporte.RESPOSTA.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

import com.crud.suporte.USUARIOS.model.Usuario;
import com.crud.suporte.CHAMADO.model.Chamado;

@Entity
@Table(name = "respostas")
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

    // Construtores
    public Resposta() {}

    public Resposta(String mensagem, LocalDateTime dataResposta, Usuario usuario, Chamado chamado) {
        this.mensagem = mensagem;
        this.dataResposta = dataResposta;
        this.usuario = usuario;
        this.chamado = chamado;
    }

    // Getters e setters (ou use Lombok para gerar automaticamente)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public LocalDateTime getDataResposta() { return dataResposta; }
    public void setDataResposta(LocalDateTime dataResposta) { this.dataResposta = dataResposta; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Chamado getChamado() { return chamado; }
    public void setChamado(Chamado chamado) { this.chamado = chamado; }
}
