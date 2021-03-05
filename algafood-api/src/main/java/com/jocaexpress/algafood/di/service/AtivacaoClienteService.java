package com.jocaexpress.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;
import com.jocaexpress.algafood.di.notificacao.NivelUrgencia;
import com.jocaexpress.algafood.di.notificacao.Notificador;
import com.jocaexpress.algafood.di.notificacao.TipoDoNotificador;


@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher; // Esta interface é capaz de publicar event e algum ouvinte captura.
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente)); // Método que dispara evento
	}
	
}
