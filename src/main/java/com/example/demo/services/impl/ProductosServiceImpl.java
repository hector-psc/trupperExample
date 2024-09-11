package com.example.demo.services.impl;

import com.example.demo.entities.ProductosEntity;
import com.example.demo.repositories.ProductosRepository;
import com.example.demo.services.ProductosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductosServiceImpl implements ProductosService {

    private final ProductosRepository repository;

    @Override
    public List<ProductosEntity> getProductos(){
        return repository.findAll();
    }


}
