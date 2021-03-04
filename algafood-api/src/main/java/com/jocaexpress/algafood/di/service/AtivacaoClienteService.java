package com.jocaexpress.algafood.di.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;
import com.jocaexpress.algafood.di.notificacao.NivelUrgencia;
import com.jocaexpress.algafood.di.notificacao.Notificador;
import com.jocaexpress.algafood.di.notificacao.TipoDoNotificador;


@Component
public class AtivacaoClienteService {
	
	// Esta anotação recebe um parâmetro da "classe" do tipo enum. E dentro dela o Qualifier especifica o tipo de notificação
	@TipoDoNotificador(NivelUrgencia.URGENTE)  
	
	@Autowired
	private Notificador notificador; // Uma lista de beans. No caso atual temos dois beans de notificação.
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
