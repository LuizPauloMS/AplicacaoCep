package br.app.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.app.Api.ZipCodeApi1;
import br.app.Api.ZipCodeApi2;
import br.app.Api.DTOZipCodeApi1;
import br.app.Api.DTOZipCodeApi2;




@RestController
@RequestMapping(value = "/cep/", name = "requestCep")

public class ZipCodeController{
	
	private final ZipCodeApi1 zipCodeApi1;
	private final ZipCodeApi2 zipCodeApi2;
 
	ZipCodeController(ZipCodeApi2 zipCodeApi2){
		this.zipCodeApi1 = new ZipCodeApi1("viacep.com.br/ws/");
		this.zipCodeApi2 = zipCodeApi2;
			
	}
	
	@GetMapping(value = "{cep}", name = "getCep")		
	ZipCodeDTO getZipCodeDTO(@PathVariable("cep") String cep){
		
		DTOZipCodeApi1 responseApi1 = new DTOZipCodeApi1();
		DTOZipCodeApi2 responseApi2 = new DTOZipCodeApi2();
		responseApi1 = zipCodeApi1.acessApi(cep);
		
		if(responseApi1.getLogradouro() != null){
			return responseApi1;
		}
		
		responseApi2 = zipCodeApi2.acessApi(cep);
		return responseApi2;
	}
	
}
