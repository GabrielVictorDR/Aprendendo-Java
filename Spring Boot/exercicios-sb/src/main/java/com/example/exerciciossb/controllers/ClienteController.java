package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping(path = "/clientes/qualquer")
	public Cliente obterCliente() {
		return new Cliente (23, "Pedro", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria;", "987.654.321-11");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name="id", defaultValue="1") int id) {
		return new Cliente(id, "João Algusto", "111.111.111-11");
	}
}
