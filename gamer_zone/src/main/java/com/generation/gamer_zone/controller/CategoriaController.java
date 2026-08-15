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

import com.generation.gamer_zone.model.Categoria;
import com.generation.gamer_zone.repository.CategoriaRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // GET - Listar todas as categorias
    @GetMapping
    public ResponseEntity<List<Categoria>> getAll() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }

    // GET - Buscar categoria por ID
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getById(@PathVariable Long id) {
        return categoriaRepository.findById(id)
                .map(categoria -> ResponseEntity.ok(categoria))
                .orElse(ResponseEntity.notFound().build());
    }

    // POST - Criar categoria
    @PostMapping
    public ResponseEntity<Categoria> post(@Valid @RequestBody Categoria categoria) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(categoriaRepository.save(categoria));
    }

    // PUT - Atualizar categoria
    @PutMapping
    public ResponseEntity<Categoria> put(@Valid @RequestBody Categoria categoria) {

        if (!categoriaRepository.existsById(categoria.getId())) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(categoriaRepository.save(categoria));
    }

    // DELETE - Excluir categoria
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        if (!categoriaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        categoriaRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}