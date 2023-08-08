package com.example.demo.uce.edu.repository;

import com.example.demo.uce.edu.repository.model.Producto;

public interface ProductoRepository {

	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public Producto selccionar(Integer id);
	public void eliminar(Integer id);
	
	public Producto ingresoIdenProducto(Producto producto);
}
