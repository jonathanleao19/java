package com.generation.gamer_zone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.gamer_zone.model.Jogo;
import com.generation.gamer_zone.repository.JogoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoRepository jogoRepository;

    // GET - Listar todos os jogos
    @GetMapping
    public ResponseEntity<List<Jogo>> getAll() {
        return ResponseEntity.ok(jogoRepository.findAll());
    }

    // GET - Buscar jogo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Jogo> getById(@PathVariable Long id) {
        return jogoRepository.findById(id)
                .map(jogo -> ResponseEntity.ok(jogo))
                .orElse(ResponseEntity.notFound().build());
    }

    // POST - Criar jogo
    @PostMapping
    public ResponseEntity<Jogo> post(@Valid @RequestBody Jogo jogo) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(jogoRepository.save(jogo));
    }

    // PUT - Atualizar jogo
    @PutMapping
    public ResponseEntity<Jogo> put(@Valid @RequestBody Jogo jogo) {

        if (!jogoRepository.existsById(jogo.getId())) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(jogoRepository.save(jogo));
    }

    // DELETE - Excluir jogo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        if (!jogoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        jogoRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}