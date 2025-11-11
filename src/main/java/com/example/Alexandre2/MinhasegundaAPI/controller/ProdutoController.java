package com.example.Alexandre2.MinhasegundaAPI.controller;

import com.example.Alexandre2.MinhasegundaAPI.Model.Produto;
import com.example.Alexandre2.MinhasegundaAPI.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos") // Define a URL base para este controller
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // CREATE (Cadastrar) - O endpoint que está faltando!
    // Responde a POST http://localhost:8081/produtos
    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        Produto novoProduto = produtoService.save(produto);
        return ResponseEntity.ok(novoProduto);
    }

    // READ (Listar todos)
    // Responde a GET http://localhost:8081/produtos
    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.ok(produtoService.findAll());
    }

    // READ (Buscar por ID)
    // Responde a GET http://localhost:8081/produtos/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        Optional<Produto> produto = produtoService.findById(id);
        if (produto.isPresent()) {
            return ResponseEntity.ok(produto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // UPDATE (Atualizar)
    // Responde a PUT http://localhost:8081/produtos/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
        Optional<Produto> produto = produtoService.update(id, produtoAtualizado);
        if (produto.isPresent()) {
            return ResponseEntity.ok(produto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE (Deletar)
    // Responde a DELETE http://localhost:8081/produtos/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        if (produtoService.deleteById(id)) {
            return ResponseEntity.noContent().build(); // Sucesso, sem conteúdo
        } else {
            return ResponseEntity.notFound().build(); // Não encontrado
        }
    }
}