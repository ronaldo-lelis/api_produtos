package com.produto.dev_lelis.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.produto.dev_lelis.models.Produto;
import com.produto.dev_lelis.repository.ProdutoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="*")
@Tag(name = "Produtos", description = "Endpoints para gerenciamento de produtos")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	@Operation(summary = "Lista todos os produtos")
	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@Operation(summary = "Busca um produto pelo ID")
	public Produto listarProdutoUnico(@PathVariable(value="id") long id) {
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/produto")
	@Operation(summary = "Cria um novo produto")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	@DeleteMapping("/produto")
	@Operation(summary = "Remove um produto")
	public void deletarProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	@Operation(summary = "Atualiza um produto existente")
	public Produto editarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
}