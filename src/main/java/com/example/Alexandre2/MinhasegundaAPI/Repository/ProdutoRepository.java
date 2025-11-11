package com.example.Alexandre2.MinhasegundaAPI.Repository;

import com.example.Alexandre2.MinhasegundaAPI.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}