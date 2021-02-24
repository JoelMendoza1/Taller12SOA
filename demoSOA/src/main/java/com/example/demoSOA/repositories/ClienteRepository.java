package com.example.demoSOA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSOA.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
