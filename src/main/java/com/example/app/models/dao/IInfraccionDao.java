package com.example.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.models.entity.Infraccion;

public interface IInfraccionDao extends JpaRepository<Infraccion, Long>{
	
	public List<Infraccion> findByCalificacion(String calificacion);
	public List<Infraccion> findByCodigo(String codigo);
}
