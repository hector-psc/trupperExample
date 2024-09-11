package com.example.demo.services;

import com.example.demo.entities.PedidosEntity;

import java.util.List;

public interface PedidosService {
    List<PedidosEntity> getPedidos();
    boolean insertPedido(PedidosEntity entity);
}
