package com.jocaexpress.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jocaexpress.algafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService();
	}
	
}
