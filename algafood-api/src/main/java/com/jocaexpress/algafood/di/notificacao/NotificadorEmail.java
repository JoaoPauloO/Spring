package com.jocaexpress.algafood.di.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;

@Primary // Quando houve dois beans a serem executados e apresentar o erro de ambiguidade, esta anotação da preferência a este bean.
@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
