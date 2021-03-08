package com.jocaexpress.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.jocaexpress.algafood.AlgafoodApiApplication;
import com.jocaexpress.algafood.model.Cozinha;

public class AlteraçãoCozinhaMain {
	// rodando uma aplicação não WEB. Uma aplicação Java
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class); // Retorna um(a) Bean/Instancia de cadastro cozinha.
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Chinesa");
		
		// Neste caso especifico, já exitia um cadastro com este ID. O Spring dá um merge e entende que não é iserção e sim um update.
		// Isso dentro do contexto de persitência.
		cadastroCozinha.salvar(cozinha); 
	}
}
