package com.jocaexpress.algafood.di.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME) 
@Qualifier
public @interface TipoDoNotificador {
	
	NivelUrgencia value(); // A anotação recebe o valor da classe enum e o qualifier passa a ser o valor passado.
	
}
