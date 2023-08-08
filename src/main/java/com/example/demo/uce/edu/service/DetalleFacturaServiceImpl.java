package com.example.demo.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.edu.repository.DetalleFacturaRepository;
import com.example.demo.uce.edu.repository.model.DetalleFactura;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService{

	@Autowired
	private DetalleFacturaRepository detalleFacturaRepository;
	
	@Override
	public void registrar(DetalleFactura detalleFactura) {
		
		this.detalleFacturaRepository.insertar(detalleFactura);
	}

	@Override
	public void guardar(DetalleFactura detalleFactura) {
		
		this.detalleFacturaRepository.actualizar(detalleFactura);
	}

	@Override
	public DetalleFactura buscar(Integer id) {
		
		return this.detalleFacturaRepository.selccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		
		this.detalleFacturaRepository.eliminar(id);
	}

}
