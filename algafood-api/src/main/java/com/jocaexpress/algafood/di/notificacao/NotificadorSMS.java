package com.jocaexpress.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do SMS %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
