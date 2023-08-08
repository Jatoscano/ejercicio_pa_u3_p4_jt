package com.example.demo.uce.edu.repository;

import java.util.List;

import com.example.demo.uce.edu.repository.model.DetalleFactura;

public interface DetalleFacturaRepository {

	public void insertar(DetalleFactura detalleFactura);
	public void actualizar(DetalleFactura detalleFactura);
	public DetalleFactura selccionar(Integer id);
	public void eliminar(Integer id);
	
	public List<DetalleFactura> detalles();
}
