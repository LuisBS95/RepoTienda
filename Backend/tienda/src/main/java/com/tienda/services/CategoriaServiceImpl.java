package com.tienda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.entities.CategoriaEntity;
import com.tienda.repositories.CategoriaDao;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaDao categoriaDao;
	
	@Override
	public List<CategoriaEntity> encontraCategorias() {
		
		List<CategoriaEntity> listaCategorias = (List<CategoriaEntity>) categoriaDao.findAll();
//		for(CategoriaEntity catego : listaCategorias) {
//			categotoDTO(catego);
//		}
	
		return listaCategorias;
	}

}
