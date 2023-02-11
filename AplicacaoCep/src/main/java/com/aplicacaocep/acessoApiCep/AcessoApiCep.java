package com.aplicacaocep.acessoApiCep;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url = "viacep.com.br/ws/", name = "cep")

public interface AcessoApiCep {
	@RequestMapping("{cep}/json")	
	public Endereco chamarCep(@PathVariable("cep")String cep);
}
