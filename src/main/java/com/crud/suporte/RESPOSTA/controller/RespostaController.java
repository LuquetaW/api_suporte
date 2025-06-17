package com.crud.suporte.RESPOSTA.controller;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.crud.suporte.RESPOSTA.repository.RespostaRepository;
import com.crud.suporte.RESPOSTA.service.RespostaService;


import com.crud.suporte.RESPOSTA.dto.RespostaDTO;
import com.crud.suporte.RESPOSTA.model.Resposta;

@RestController
@RequestMapping("/respostas")
public class RespostaController {

    private final RespostaRepository respostaRepository;

    @Autowired
    private RespostaService respostaService;

    @Autowired
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