package com.jocaexpress.algafood.di.notificacao;

import com.jocaexpress.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}