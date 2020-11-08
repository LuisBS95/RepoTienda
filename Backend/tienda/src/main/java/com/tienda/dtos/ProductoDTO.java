package com.tienda.dtos;

import java.util.List;




public class ProductoDTO {


	
	private Long idProducto;
	
	private String producto;
	
	private Double precio;
	
	private String descripcion;
	
	private String imagen;
	
	private Long IdCategoria;

	
	public ProductoDTO() {
		
		
	}
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	public Long getIdCategoria() {
		return IdCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		IdCategoria = idCategoria;
	}
	public ProductoDTO(Long idProducto, String producto, Double precio, String descripcion, String imagen) {
		
		this.idProducto = idProducto;
		this.producto = producto;
		this.precio = precio;
		this.descripcion = descripcion;
		this.imagen = imagen;
		
	}
	
	//private List<PedidosProductoEntity> pedidosProducto;

	
}
