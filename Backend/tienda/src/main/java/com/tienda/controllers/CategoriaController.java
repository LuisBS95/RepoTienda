package com.tienda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tienda.dtos.CategoriaDTO;
import com.tienda.entities.CategoriaEntity;

import com.tienda.services.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/listar")
	public List<CategoriaEntity> listarCategorias(){
		
		return categoriaService.encontraCategorias();
	}
	
	@GetMapping("/super")
	public List<CategoriaDTO> listarSuper(){
		return categoriaService.SuperCategorias();
	}
	
	@GetMapping("/sub/{id}")
	public List<CategoriaEntity> listarSub(@PathVariable(name = "id") Long id){
		return categoriaService.SubCategorias(id);
	}

}
