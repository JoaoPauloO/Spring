package com.jocaexpress.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jocaexpress.algafood.di.notificacao.Notificador;
import com.jocaexpress.algafood.di.service.AtivacaoClienteService;

@Configuration // Configuration é também um component Spring e serve para definir os BEANS!
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
	
}
