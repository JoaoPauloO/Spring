package com.jocaexpress.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;
import com.jocaexpress.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired(required = false) // Informo ao gerenciado do Spring que essa dependência não é obrigatória
	private Notificador notificador;
	
//	@Autowired 
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//		
//		System.out.println("AtivacaoClienteService: "+ notificador);
//	}
	
//	public AtivacaoClienteService(String qualquer) {}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		} else {
			System.out.println("Não existe notificador, mas o cliente foi ativado!");
		}
	}

	public Notificador getNotificador() {
		return notificador;
	}
	
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
}
