package com.tienda.services;

import java.util.List;

import com.tienda.dtos.CategoriaDTO;
import com.tienda.entities.CategoriaEntity;


public interface CategoriaService {
	
	public List<CategoriaEntity> encontraCategorias();
	
	public List <CategoriaDTO> SuperCategorias();
	
	public List <CategoriaEntity> SubCategorias(Long id);

}
