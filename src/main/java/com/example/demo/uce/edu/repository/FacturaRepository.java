package com.example.demo.uce.edu.repository;

import java.util.List;

import com.example.demo.uce.edu.repository.model.Factura;

public interface FacturaRepository {

	public void insertar(Factura factura);
	public void actualizar(Factura factura);
	public Factura selccionar(Integer id);
	public void eliminar(Integer id);
	
	public List<Factura> reporteFacturas();
}
