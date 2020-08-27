package br.gov.rj.faeterj.estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.gov.rj.faeterj.estoque.model.Produto;

@Controller
public class ProdutosController {

	// Método GET
	@RequestMapping("/produtos/novo")
	public String novo() {
		return "produto/CadastroProduto";
	}
	
	// Método POST
	@RequestMapping(value = "/produtos/novo", method = RequestMethod.POST)
	public String cadastrar(Produto produto) {
		System.out.println(">>> sku: " + produto.getSku());
		return "produto/CadastroProduto";
	}
	
}
