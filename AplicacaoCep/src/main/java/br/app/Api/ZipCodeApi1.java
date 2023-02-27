package br.app.Api;



import org.springframework.web.reactive.function.client.WebClient;



public class ZipCodeApi1 {
	final private WebClient webClient;
	
	public ZipCodeApi1(String url) {
		this.webClient = WebClient.builder()
								  .baseUrl(url)
								  .build();
	}

	public DTOZipCodeApi1 acessApi(String cep) {
		return webClient.get().uri(cep+"/json").retrieve().bodyToMono(DTOZipCodeApi1.class).block();
	}
}
