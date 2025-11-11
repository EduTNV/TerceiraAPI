package com.example.Alexandre2.MinhasegundaAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 1. Adicione este import
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// 2. Adicione esta anotação, apontando para o pacote do seu repositório
@EnableJpaRepositories(basePackages = "com.example.Alexandre2.MinhasegundaAPI.Repository")
@SpringBootApplication
public class MinhasegundaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinhasegundaApiApplication.class, args);
    }

}