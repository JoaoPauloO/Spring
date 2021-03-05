package com.jocaexpress.algafood.di.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.notificacao.NivelUrgencia;
import com.jocaexpress.algafood.di.notificacao.Notificador;
import com.jocaexpress.algafood.di.notificacao.TipoDoNotificador;
import com.jocaexpress.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	// Essa classe tem interesse em ouvir qual cliente foi ativado para notificá-lo
	// Tem como criar vários ouvidores de eventos
	
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	@EventListener // Informa que este método é um ouvinte de evento
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "agora está ativo em nosso sistema!");
	}
	
}
