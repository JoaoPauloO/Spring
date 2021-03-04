package com.jocaexpress.algafood.di.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME) // Quanto tempo deve permanecer quando for usada. No caso de RUNTIME será no tempo de execução.
@Qualifier // O Qualifier classifica a "classe" ou anotação de acordo com o valor que é passado do enum através do NivelUrgencia value.
public @interface TipoDoNotificador {
	
	NivelUrgencia value();
	
}
