package com.jocaexpress.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.model.Cozinha;

@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar() {
		TypedQuery<Cozinha> query = (TypedQuery<Cozinha>) manager.createQuery("from Cozinha", Cozinha.class); // Criando a query de consulta.

		return query.getResultList(); // A query de consulta busca tudo da tabela cozinha, e então adciona numa lista e retorna uma lista.
	}
	
}
