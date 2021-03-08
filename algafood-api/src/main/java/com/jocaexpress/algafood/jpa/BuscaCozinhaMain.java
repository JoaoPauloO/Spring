package com.jocaexpress.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.jocaexpress.algafood.AlgafoodApiApplication;
import com.jocaexpress.algafood.model.Cozinha;

public class BuscaCozinhaMain {
	// rodando uma aplicação não WEB. Uma aplicação Java
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class); // Retorna um(a) Bean/Instancia de cadastro cozinha.
		
		Cozinha cozinha = cadastroCozinha.buscar(4L);
		
		System.out.println("Objeto retornado: "+ cozinha.getNome());
	}
}
