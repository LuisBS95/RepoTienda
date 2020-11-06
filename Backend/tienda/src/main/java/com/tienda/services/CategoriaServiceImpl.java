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
	
	@Override
	public List <CategoriaEntity> SuperCategorias(){
		return (List<CategoriaEntity>) categoriaDao.findSuperCategorias();
	}
	
	@Override
	public List <CategoriaEntity> SubCategorias(Long id){
		return (List<CategoriaEntity>) categoriaDao.findSubCategorias(id);
	}

}
