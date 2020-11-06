package com.tienda.services;

import java.util.List;

import com.tienda.entities.CategoriaEntity;


public interface CategoriaService {
	
	public List<CategoriaEntity> encontraCategorias();
	
	public List <CategoriaEntity> SuperCategorias();
	
	public List <CategoriaEntity> SubCategorias(Long id);

}
