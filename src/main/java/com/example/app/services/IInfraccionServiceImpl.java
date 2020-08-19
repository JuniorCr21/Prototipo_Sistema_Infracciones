package com.example.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.app.models.dao.IInfraccionDao;
import com.example.app.models.entity.Infraccion;

@Service
public class IInfraccionServiceImpl implements IInfraccionService{

	@Autowired
	private IInfraccionDao infraccionDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Infraccion> findAll() {
		return (List<Infraccion>)infraccionDao.findAll();
	}

	@Transactional
	@Override
	public Infraccion save(Infraccion infraccion) {
		return infraccionDao.save(infraccion);
	}

	@Transactional(readOnly = true)
	@Override
	public Infraccion findById(Long id) {
		return infraccionDao.findById(id).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Infraccion> findByCalificacion(String calificacion) {
		return (List<Infraccion>)infraccionDao.findByCalificacion(calificacion);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Infraccion> findByCodigo(String codigo) {
		return (List<Infraccion>)infraccionDao.findByCodigo(codigo);
	}

}
