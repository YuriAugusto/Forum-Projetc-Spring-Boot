package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")//ao digitar o endereço o método é chamado
	@ResponseBody//Indica ao Spring que o retorno do método deve ser devolvido como resposta (exibe no browser)
	public String hello() {
		return "Hello World!";
	}

}
