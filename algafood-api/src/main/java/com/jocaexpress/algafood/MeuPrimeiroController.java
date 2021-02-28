package com.jocaexpress.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jocaexpress.algafood.di.modelo.Cliente;
import com.jocaexpress.algafood.di.service.AtivacaoClienteService;

@Controller // Anotação @Controller é uma meta anotação, e dentro dela também há o @Component. Assim também se torna um Bean e é gerenciada pelo o Spring.
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroControler: "+ ativacaoClienteService);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente joao = new Cliente("João", "joao@xyz.com", "999999");
		
		ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}
	
}
