package com.example.demo.uce.edu.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.edu.repository.model.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepositoryImpl implements ProductoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Producto producto) {
		
		this.entityManager.persist(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		
		this.entityManager.merge(producto);
	}

	@Override
	public Producto selccionar(Integer id) {
		
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		
		this.entityManager.remove(this.selccionar(id));
	}

	@Override
	public Producto ingresoIdenProducto(Producto producto) {
		
		if (producto.getStock() > 1) {
			this.insertar(producto);
		}
		else {
			System.out.println("El producto esta en stock");
		}
		return producto;
	}
	
	

}
