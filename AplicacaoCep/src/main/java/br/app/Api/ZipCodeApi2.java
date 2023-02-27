package br.app.Api;


import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@FeignClient(url = "https://api.postmon.com.br/v1/cep/", name = "ViaCep")

public interface ZipCodeApi2 {
	@RequestMapping("{cep}")	
	public DTOZipCodeApi2 acessApi(@PathVariable("cep")String cep);
	

}
