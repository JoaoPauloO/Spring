package com.jocaexpress.algafood.di.notificacao;

import com.jocaexpress.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;

@Profile("dev") // Esta anotação indica qual ambiente de desevolvimento é esta classe. No caso "dev" é de desenvolvimento!
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador{

	public NotificadorEmailMock() {
		System.out.println("Instanciou o DEV");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificacao seria enviada para %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
