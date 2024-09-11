package com.example.demo.services;

import com.example.demo.dtos.PedidoDTO;
import com.example.demo.entities.ProductosEntity;

import java.util.List;

public interface ProductosService {

    List<ProductosEntity> getProductos();

}
