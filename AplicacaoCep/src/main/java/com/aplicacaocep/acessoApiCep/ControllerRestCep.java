package com.aplicacaocep.acessoApiCep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class ControllerRestCep{
	@Autowired
	AcessoApiCep endereco;

	@GetMapping("/{cep}")
	 Endereco acessoApicep(@PathVariable("cep")String cep){
		return endereco.chamarCep(cep);
	}
	
	
}
