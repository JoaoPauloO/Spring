package com.jocaexpress.algafood.di.service;

import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;
import com.jocaexpress.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
