package com.jocaexpress.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.jocaexpress.algafood.AlgafoodApiApplication;
import com.jocaexpress.algafood.model.Cozinha;

public class ConsultaCozinhaMain {
	// rodando uma aplicação não WEB. Uma aplicação Java
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class); // Retorna um(a) Bean/Instancia de cadastro cozinha.
		
		List<Cozinha> cozinhas = cadastroCozinha.listar(); // Recebe o retorno da lista 
		
		for(Cozinha cozinha :  cozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
}
