package com.tienda.dtos;

import java.util.List;


import com.tienda.entities.ProductoEntity;

public class CategoriaDTO {


	private Long idCategoria;
	
	private String categoria;

	private Long subCategoria;
	
	private List<ProductoDTO> productos;

	public CategoriaDTO() {

	}
	
	public CategoriaDTO(Long idCategoria, String categoria, Long subCategoria, List<ProductoDTO> productos) {
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.subCategoria = subCategoria;
		this.productos = productos;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Long getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(Long subCategoria) {
		this.subCategoria = subCategoria;
	}

	public List<ProductoDTO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoDTO> productos) {
		this.productos = productos;
	}
	
	
	
}
