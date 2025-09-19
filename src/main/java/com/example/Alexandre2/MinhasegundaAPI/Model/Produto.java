package com.example.Alexandre2.MinhasegundaAPI.Model;

public class Produto {
    private Long id;
    private String nome;
    private Double preco;

    // Construtor vazio (necessÃ¡rio para o Spring Boot)
    public Produto() {
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Produto(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

}