package com.example.demo.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.edu.repository.model.DetalleFactura;
import com.example.demo.uce.edu.repository.model.Factura;
import com.example.demo.uce.edu.repository.model.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DetalleFacturaRepositoryImpl implements DetalleFacturaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(DetalleFactura detalleFactura) {
		
		this.entityManager.persist(detalleFactura);
	}

	@Override
	public void actualizar(DetalleFactura detalleFactura) {
		
		this.entityManager.merge(detalleFactura);
	}

	@Override
	public DetalleFactura selccionar(Integer id) {
		
		return this.entityManager.find(DetalleFactura.class, id);
	}

	@Override
	public void eliminar(Integer id) {
	
		this.entityManager.remove(this.selccionar(id));
	}

	@Override
	public List<DetalleFactura> detalles() {
		return null;
	}
	
	

}
