package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Garante acesso aos metodos e protocolos HTTP
@RequestMapping("/todas") // Configurou o caminho para acessa-lo
public class HelloWorldController {

	@GetMapping("/hello") // Puxa a aplicação quando requisitado pelo cliente
	public String HelloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/bsm")
	public String BSM() {
		return "Responsabilidade pessoal, Mentalidade de Crescimento, Orientação ao Futuro, Persistência, Comunicação, Orientação aos Detalhes, Trabalho em Equipe, Proatividade.";
	}
	
	@GetMapping("/obj")
	public String Objetivos() {
		return "Aprender sobre o Back-End, masterizando o aprendizado em Spring Boot e MySQL.";
	}
	
}