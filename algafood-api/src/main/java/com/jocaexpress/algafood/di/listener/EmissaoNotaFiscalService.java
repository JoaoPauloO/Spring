package com.jocaexpress.algafood.di.listener;

import org.springframework.context.event.EventListener;

import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {
	
	@EventListener // Informa que este método é um ouvinte de evento
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Sua nota fisca foi emitida!");
	}
	
	
}
