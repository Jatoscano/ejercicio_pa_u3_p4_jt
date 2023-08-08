package com.example.demo.uce.edu.service;

import com.example.demo.uce.edu.repository.model.DetalleFactura;

public interface DetalleFacturaService {

	public void registrar(DetalleFactura detalleFactura);
	public void guardar(DetalleFactura detalleFactura);
	public DetalleFactura buscar(Integer id);
	public void borrar(Integer id);
}
