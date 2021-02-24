package com.example.demoSOA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSOA.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer>{

}
