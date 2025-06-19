package com.crud.suporte.CATEGORIA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.crud.suporte.CATEGORIA.dto.CategoriaChamadoDTO;
import com.crud.suporte.CATEGORIA.model.CategoriaChamado;
import com.crud.suporte.CATEGORIA.service.CategoriaChamadoService;

@RestController
@RequestMapping("/categoria")
public class CategoriaChamadoController {

    @Autowired
    private CategoriaChamadoService service;

    @GetMapping
    public List<CategoriaChamado> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaChamado> buscarPorId(@PathVariable Integer id) {
        Optional<CategoriaChamado> categoria = service.buscarPorId(id);
        return categoria.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public CategoriaChamado criar(@RequestBody CategoriaChamadoDTO dto) {
        return service.salvar(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaChamado> atualizar(@PathVariable Integer id, @RequestBody CategoriaChamadoDTO dto) {
        try {
            CategoriaChamado categoriaAtualizada = service.atualizar(id, dto);
            return ResponseEntity.ok(categoriaAtualizada);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}