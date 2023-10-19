package com.generation.crudfarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.crudfarmacia.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}
