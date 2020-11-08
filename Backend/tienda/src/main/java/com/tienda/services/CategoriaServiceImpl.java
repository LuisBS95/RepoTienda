package com.tienda.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.dtos.CategoriaDTO;
import com.tienda.dtos.ProductoDTO;
import com.tienda.entities.CategoriaEntity;
import com.tienda.entities.ProductoEntity;
import com.tienda.repositories.CategoriaDao;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaDao categoriaDao;
	
	@Override
	public List<CategoriaEntity> encontraCategorias() {
		
		List<CategoriaEntity> listaCategorias = (List<CategoriaEntity>) categoriaDao.findAll();
		
	
		return listaCategorias;
	}
	
	@Override
	public List<CategoriaDTO> SuperCategorias(){
		
		List<CategoriaDTO> listaCategoDTO = new ArrayList<>();
		for(CategoriaEntity catego : (List<CategoriaEntity>) categoriaDao.findSuperCategorias()) {
			
			listaCategoDTO.add(categoriaToDTO(catego));
			
		}
		return listaCategoDTO;
	}
	
	@Override
	public List <CategoriaEntity> SubCategorias(Long id){
		return (List<CategoriaEntity>) categoriaDao.findSubCategorias(id);
	}
	
	
	//Convertir a DTO
	
	//Entity to DTO Categoria
	public static CategoriaDTO categoriaToDTO(CategoriaEntity categoriaEnt) {
		
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		
		categoriaDTO.setIdCategoria(categoriaEnt.getIdCategoria());
		categoriaDTO.setCategoria(categoriaEnt.getCategoria());
		categoriaDTO.setSubCategoria(categoriaEnt.getSubCategoria());
		
//		if(categoriaEnt.getProductos() != null) {
//			for(ProductoEntity prod: categoriaEnt.getProductos()) {
//				ProductoDTO productdo = new ProductoDTO();
//				productdo.setIdProducto(prod.getIdProducto());
//				productdo.setProducto(prod.getProducto());
//				
//			}
//		}
		
		
		
		return categoriaDTO;
		
	}

}
