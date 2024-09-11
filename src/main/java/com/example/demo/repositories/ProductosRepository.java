package com.example.demo.repositories;

import com.example.demo.entities.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<ProductosEntity, Double> {
}
