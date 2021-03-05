package com.jocaexpress.algafood.di.service;

import com.jocaexpress.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	
	private Cliente cliente; // Este atributo representa no momento da execução o cliente que foi ativado

	public ClienteAtivadoEvent(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}
