package com.crud.suporte.RESPOSTA.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crud.suporte.RESPOSTA.model.Resposta;
import com.crud.suporte.RESPOSTA.repository.RespostaRepository;

@Service
public class RespostaService {

    private final RespostaRepository respostaRepository;

    public RespostaService(RespostaRepository respostaRepository) {
        this.respostaRepository = respostaRepository;
    }

    public Resposta salvarResposta(Resposta resposta) {
        return respostaRepository.save(resposta);
    }

    public List<Resposta> listarRespostas() {
        return respostaRepository.findAll();
    }

    public Optional<Resposta> buscarPorId(Long id) {
        return respostaRepository.findById(id);
    }
    // Excluir resposta
    public void deletarResposta(Long id) {
        respostaRepository.deleteById(id);
    }


}