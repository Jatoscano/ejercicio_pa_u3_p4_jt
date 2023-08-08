package com.example.demo.uce.edu.service;

import com.example.demo.uce.edu.repository.model.Producto;

public interface ProductoService {

	public void registrar(Producto producto);
	public void guardar(Producto producto);
	public Producto buscar(Integer id);
	public void borrar(Integer id);
}
