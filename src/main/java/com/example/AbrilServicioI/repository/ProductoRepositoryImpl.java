package com.example.AbrilServicioI.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.AbrilServicioI.model.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductosRepository {
	
	public List<Producto> listar=new ArrayList<Producto>();

	@Override
	public void guardarProdducto(Producto prod) {
		listar.add(prod);

	}

	@Override
	public void editarProducto(Producto prod) {
		listar.remove(obtenerProducto(prod.getId()));
		listar.add(prod);
	}

	@Override
	public void eliminarProducto(Integer id) {
		listar.remove(obtenerProducto(id));
	}

	@Override
	public List<Producto> listarProductos() {
		return listar;
	}

	@Override
	public Producto obtenerProducto(Integer id) {
		
		return listar.stream().filter(p->p.getId()==id).findFirst().orElse(null);
	}

}
