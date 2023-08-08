package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.edu.repository.model.DetalleFactura;
import com.example.demo.uce.edu.repository.model.Factura;
import com.example.demo.uce.edu.repository.model.Producto;
import com.example.demo.uce.edu.service.ProductoService;

@SpringBootApplication
public class EjercicioPaU3P4JtApplication implements CommandLineRunner{

	@Autowired
	private ProductoService productoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4JtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Producto producto = new Producto();
		Producto producto2 = new Producto();
		Factura factura = new Factura();
		DetalleFactura detalleFactura = new DetalleFactura();
		
		producto.setNombre("pescado");
		producto.setPrecio(new BigDecimal(25));
		producto.setCodigoBarras("7890");
		producto.setCategoria("Embutidos");
		producto.setStock(3);
		
		producto.setNombre("pollo");
		producto.setPrecio(new BigDecimal(10));
		producto.setCodigoBarras("5678");
		producto.setCategoria("Embutidos");
		producto.setStock(4);
		
		this.productoService.registrar(producto);
		this.productoService.registrar(producto2);
	}

	
}
