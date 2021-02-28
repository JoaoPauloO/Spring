package com.jocaexpress.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Ao inicializar uma aplicação, 
 * o Spring faz um "Scaneamento" nas classes e assim encontra suas dependências. 
 * A anotação está dentro da @SpringBootApplication >>> @ComponentScan */

@SpringBootApplication
public class AlgafoodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgafoodApiApplication.class, args);
	}

}
