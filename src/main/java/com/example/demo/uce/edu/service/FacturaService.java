package com.example.demo.uce.edu.service;

import com.example.demo.uce.edu.repository.model.Factura;

public interface FacturaService {
	
	public void registrar(Factura factura);
	public void guardar(Factura factura);
	public Factura buscar(Integer id);
	public void borrar(Integer id);
}
