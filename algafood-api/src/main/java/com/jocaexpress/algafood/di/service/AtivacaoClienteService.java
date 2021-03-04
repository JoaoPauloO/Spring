package com.jocaexpress.algafood.di.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;
import com.jocaexpress.algafood.di.notificacao.Notificador;


@Component
public class AtivacaoClienteService {
	
	@Autowired
	private Notificador notificador; // Uma lista de beans. No caso atual temos dois beans de notificação.
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
