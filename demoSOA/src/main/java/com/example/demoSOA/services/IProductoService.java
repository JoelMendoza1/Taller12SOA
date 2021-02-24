package com.example.demoSOA.services;

import java.util.List;

import com.example.demoSOA.models.Producto;

public interface IProductoService {
	Producto create (Producto c);
	
	Producto update (Producto c);
	
	Producto findById (Integer id);
	
	List<Producto> findall ();
	
	void delete(Integer id);
}
