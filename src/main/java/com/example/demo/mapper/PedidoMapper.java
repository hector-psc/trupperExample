package com.example.demo.mapper;

import com.example.demo.dtos.PedidoDTO;
import com.example.demo.entities.PedidosEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PedidoMapper {
    PedidoMapper INSTANCE = Mappers.getMapper(PedidoMapper.class);
    PedidosEntity toProductEntity(PedidoDTO pedido);
    PedidoDTO toProductDTO(PedidosEntity pedido);
}
