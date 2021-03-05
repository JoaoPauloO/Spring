package com.jocaexpress.algafood.di.service;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;
import com.jocaexpress.algafood.di.notificacao.NivelUrgencia;
import com.jocaexpress.algafood.di.notificacao.Notificador;
import com.jocaexpress.algafood.di.notificacao.TipoDoNotificador;


//@Component
public class AtivacaoClienteService {
	
	@TipoDoNotificador(NivelUrgencia.NORMAL)  
	
	@Autowired
	private Notificador notificador;
	
//	@PostConstruct
	public void init () {
		System.out.println("INIT" + notificador);
	}
	
//	@PreDestroy
	public void destroy () {
		System.out.println("DESTROY");
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
