package com.jocaexpress.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;
import com.jocaexpress.algafood.di.notificacao.Notificador;


@Component
public class AtivacaoClienteService {
	
	@Autowired
	private List<Notificador> notificadores; // Uma lista de beans. No caso atual temos dois beans de notificação.
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		for(Notificador notificador : notificadores) { // Um foreach para poder usar todas as forma de notificação
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	}
	
}
