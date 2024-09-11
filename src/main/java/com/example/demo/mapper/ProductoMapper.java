package com.example.demo.mapper;

import com.example.demo.dtos.ProductoDTO;
import com.example.demo.entities.ProductosEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductoMapper {
    ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);
    ProductoDTO toProductoDTO(ProductosEntity producto);
    ProductosEntity toProductoEntity(ProductoDTO producto);
}
