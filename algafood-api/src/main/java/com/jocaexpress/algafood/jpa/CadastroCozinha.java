package com.jocaexpress.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jocaexpress.algafood.model.Cozinha;

@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar() {
		TypedQuery<Cozinha> query = (TypedQuery<Cozinha>) manager.createQuery("from Cozinha", Cozinha.class); // Criando a query de consulta.

		return query.getResultList(); // A query de consulta busca tudo da tabela cozinha, e então adciona numa lista e retorna uma lista.
	}
	
	public Cozinha buscar(Long id) {
		// select * from Cozinha where id =  "id" 
		return manager.find(Cozinha.class, id); // Este método busca pelo o Id. No cazo, ele busca por uma "instancia" de cozinha. 
	}
	
	@Transactional // Este método é executado dentro de uma transação!
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha); // Fundi/Coloca entidade a entidade dentro de um contexto de persitência.
	}
	
	@Transactional 
	public void remove(Cozinha cozinha) {
		cozinha = buscar(cozinha.getId());
		manager.remove(cozinha);
	}
	
}
