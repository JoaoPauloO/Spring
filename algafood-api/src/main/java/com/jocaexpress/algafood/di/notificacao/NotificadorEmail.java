package com.jocaexpress.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;

@Component // Gerencia a classe, tornando-a em um BEAN. Assim, o construtor dessa classe vira uma instancia dentro ou do BEAN.
public class NotificadorEmail {
	
	public NotificadorEmail() { // Pelo o fato da classe ser gerenciada por BEAN, o construtor é instanciado! "Injeção de dependência" e fica pronta para uso.
		System.out.println("Construtor chamado!");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
