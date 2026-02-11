package com.produto.dev_lelis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.dev_lelis.models.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);

}
