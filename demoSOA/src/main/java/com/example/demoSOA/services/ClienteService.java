package com.example.demoSOA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSOA.models.Cliente;
import com.example.demoSOA.repositories.ClienteRepository;
import com.example.demoSOA.services.IClienteService;
@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private ClienteRepository clienteRepo;
	@Override
	public Cliente create(Cliente c) {
		
		return clienteRepo.save(c);
	}

	@Override
	public Cliente update(Cliente c) {
		
		return clienteRepo.save(c);
	}

	@Override
	public Cliente findById(Integer id) {
		Optional<Cliente> clienteOptional = clienteRepo.findById(id);
		
		return clienteOptional.orElse(null);
	}

	@Override
	public List<Cliente> findall() {
		return clienteRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		clienteRepo.deleteById(id);
		
	}
	
}
