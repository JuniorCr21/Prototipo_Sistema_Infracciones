package com.example.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.models.entity.Infraccion;
import com.example.app.services.IInfraccionService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class InfraccionRestController {
	
	@Autowired
	private IInfraccionService infraccionService;
	
	@GetMapping("/infracciones")
	public List<Infraccion> index (){
		return infraccionService.findAll();
	}
	
	@PostMapping("/infracciones")
	@ResponseStatus(HttpStatus.CREATED)
	public Infraccion create (@RequestBody Infraccion infraccion) {
		return infraccionService.save(infraccion);
	}
	
	@GetMapping("/infracciones/form/{id}")
	public Infraccion show(@PathVariable Long id) {
		return infraccionService.findById(id);
	}
	
	@GetMapping("/infracciones/{codigo}")
	public List<Infraccion> buscarCodigo(@PathVariable String codigo){
		return infraccionService.findByCodigo(codigo);
	}
	@GetMapping("/infracciones/tipo/{calificacion}")
	public List<Infraccion> buscarCalificacion(@PathVariable String calificacion){
		return infraccionService.findByCalificacion(calificacion);
	}
}
