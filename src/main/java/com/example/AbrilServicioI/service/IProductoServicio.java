package com.example.AbrilServicioI.service;

import java.util.List;

import com.example.AbrilServicioI.model.Producto;

public interface IProductoServicio {
	
	public void guardarProdducto(Producto prod);
	
	public void editarProducto(Producto prod);
	
	public void eliminarProducto(Integer id);
	
	public List<Producto> listarProductos();
	
	public Producto obtenerProducto(Integer prod);
}
