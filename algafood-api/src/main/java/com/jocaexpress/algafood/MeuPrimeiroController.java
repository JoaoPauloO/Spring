package com.jocaexpress.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Anotação @Controller é uma meta anotação, e dentro dela também há o @Component. Assim também se torna um Bean e é gerenciada pelo o Spring.
public class MeuPrimeiroController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello!";
	}
	
}
