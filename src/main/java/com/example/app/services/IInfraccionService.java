package com.example.app.services;

import java.util.List;

import com.example.app.models.entity.Infraccion;

public interface IInfraccionService {
	public List<Infraccion> findAll();
	public Infraccion save (Infraccion infraccion);
	public Infraccion findById(Long id); 
	public List<Infraccion> findByCalificacion(String calificacion);
	public List<Infraccion> findByCodigo(String codigo);
}
