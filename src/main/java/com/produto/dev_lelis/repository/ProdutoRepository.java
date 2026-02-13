package com.produto.dev_lelis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.dev_lelis.models.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);

	Produto findByNomeAndValor(String nome, BigDecimal valor);

	public Produto pesquisarPorNome(String nome){
		Map<String, Object> params = new HashMap<>();
		params.put("nome", nome);
		return find("nome = :nome and valor = ?", params);
	}

}
