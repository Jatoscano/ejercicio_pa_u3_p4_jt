package com.example.demo.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.edu.repository.model.Factura;
import com.example.demo.uce.edu.repository.model.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepositoryImpl implements FacturaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Factura factura) {
		
		this.entityManager.persist(factura);
	}

	@Override
	public void actualizar(Factura factura) {
		
		this.entityManager.merge(factura);
	}

	@Override
	public Factura selccionar(Integer id) {
		
		return this.entityManager.find(Factura.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		
		this.entityManager.remove(this.selccionar(id));
	}

	@Override
	public List<Factura> reporteFacturas() {
		List<Producto> productos = new ArrayList<>();
		
		return null;
	}
	
	

}
