package com.jocaexpress.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jocaexpress.algafood.di.notificacao.NotificadorEmail;

@Configuration // Configuration é também um component Spring e serve para definir os BEANS!
public class NotificadorConfig {
	
	@Bean // Indica que este método inicializa, configura, instância um novo objeto que é gerenciado pelo component Spring.
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.jocamail.com");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
}
