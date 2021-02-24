package com.example.demoSOA.services;

import java.util.List;

import com.example.demoSOA.models.Cliente;

public interface IClienteService {
	Cliente create (Cliente c);
	
	Cliente update (Cliente c);
	
	Cliente findById (Integer id);
	
	List<Cliente> findall ();
	
	void delete(Integer id);
	
	
}
