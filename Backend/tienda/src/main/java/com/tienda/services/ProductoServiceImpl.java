package com.tienda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entities.ProductoEntity;
import com.tienda.repositories.ProductoDao;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	public List<ProductoEntity> encontrarProductos() {
		return (List<ProductoEntity>) productoDao.findAll();
	}

}
