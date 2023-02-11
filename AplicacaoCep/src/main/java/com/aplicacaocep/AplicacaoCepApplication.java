package com.aplicacaocep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class AplicacaoCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoCepApplication.class, args);
	}

}
