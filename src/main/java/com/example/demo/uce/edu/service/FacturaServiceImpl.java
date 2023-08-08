package com.example.demo.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.edu.repository.FacturaRepository;
import com.example.demo.uce.edu.repository.model.Factura;

@Service
public class FacturaServiceImpl implements FacturaService{

	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	public void registrar(Factura factura) {
		
		this.facturaRepository.insertar(factura);
	}

	@Override
	public void guardar(Factura factura) {
		
		this.facturaRepository.actualizar(factura);
	}

	@Override
	public Factura buscar(Integer id) {
		
		return this.facturaRepository.selccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		
		this.facturaRepository.eliminar(id);
	}

}
