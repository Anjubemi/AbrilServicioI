package com.example.AbrilServicioI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AbrilServicioI.model.Producto;
import com.example.AbrilServicioI.repository.IProductosRepository;

@Service
public class ProductoServicioImpl implements IProductoServicio {

	@Autowired public IProductosRepository repository; 
	
	@Override
	public void guardarProdducto(Producto prod) {
		repository.guardarProdducto(prod);
	}

	@Override
	public void editarProducto(Producto prod) {
		repository.editarProducto(prod);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.eliminarProducto(id);
	}

	@Override
	public List<Producto> listarProductos() {
		return repository.listarProductos();
	}

	@Override
	public Producto obtenerProducto(Integer prod) {
		return repository.obtenerProducto(prod);
	}

}
