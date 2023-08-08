package com.example.demo.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.edu.repository.ProductoRepository;
import com.example.demo.uce.edu.repository.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public void registrar(Producto producto) {
		
		this.productoRepository.insertar(producto);
	}

	@Override
	public void guardar(Producto producto) {
		
		this.productoRepository.actualizar(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		
		return this.productoRepository.selccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		
		this.productoRepository.eliminar(id);
	}

}
