package com.jocaexpress.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.jocaexpress.algafood.AlgafoodApiApplication;
import com.jocaexpress.algafood.model.Cozinha;

public class InclusaoCozinhaMain {
	// rodando uma aplicação não WEB. Uma aplicação Java
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class); // Retorna um(a) Bean/Instancia de cadastro cozinha.
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Chinesa");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Chilena");
		
		
		// Lembando que este objeto já foi isntanciado. A classe deste método é um component gerenciado pelo o Spring.
		cadastroCozinha.adcionar(cozinha1); // Utilizando o método adcionar e passando cozinha como parâmetro.
		cadastroCozinha.adcionar(cozinha2);
	}
}
