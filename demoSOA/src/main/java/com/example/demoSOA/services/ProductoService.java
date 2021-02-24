package com.example.demoSOA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSOA.models.Cliente;
import com.example.demoSOA.models.Producto;
import com.example.demoSOA.repositories.ProductoRepository;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private ProductoRepository productoRepo;
	@Override
	public Producto create(Producto p) {
		// TODO Auto-generated method stub
		return productoRepo.save(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		return productoRepo.save(p);
	}

	@Override
	public Producto findById(Integer id) {
		Optional<Producto> productoOptional = productoRepo.findById(id);
		return productoOptional.orElse(null);
	}

	@Override
	public List<Producto> findall() {
		// TODO Auto-generated method stub
		return productoRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productoRepo.deleteById(id);
	}

}
