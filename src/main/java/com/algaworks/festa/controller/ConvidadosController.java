package com.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repository.Convidados;

@Controller
@RequestMapping(path="/convidados")
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;
	
	@PostMapping
	public @ResponseBody String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Convidado> listar() {
		
		return convidados.findAll();
	}
	
	

}
