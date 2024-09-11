package com.example.demo.controllers;

import com.example.demo.dtos.OkDTO;
import com.example.demo.entities.ProductosEntity;
import com.example.demo.mapper.PedidoMapper;
import com.example.demo.services.ProductosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("productos")
@RequiredArgsConstructor
public class ProductosController {
    private final ProductosService service;

    @GetMapping
    public List<ProductosEntity> getProductos(){
        return service.getProductos();
    }



}
