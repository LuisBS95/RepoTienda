package com.tienda.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.entities.ProductoEntity;
import com.tienda.services.ProductoService;

@RestController
@RequestMapping("/producto")


public class ProductoController {

	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/listar") 
	public List<ProductoEntity> listarProducto(){
		
		return productoService.encontrarProductos();
	}
}
