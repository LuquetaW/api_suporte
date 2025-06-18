package com.crud.suporte.RESPOSTA.controller;


import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.suporte.RESPOSTA.dto.RespostaDTO;
import com.crud.suporte.RESPOSTA.model.Resposta;
import com.crud.suporte.RESPOSTA.repository.RespostaRepository;

@RestController
@RequestMapping("/respostas")
public class RespostaController {

    private final RespostaRepository respostaRepository;

    public RespostaController(RespostaRepository respostaRepository) {
        this.respostaRepository = respostaRepository;
    }

@PostMapping
public RespostaDTO criarResposta(@RequestBody Resposta resposta) {
    resposta.setDataResposta(LocalDateTime.now());

    Resposta respostaSalva = respostaRepository.save(resposta);
    return new RespostaDTO(respostaSalva);
}
}