package com.example.demo.controllers;

import com.example.demo.dtos.OkDTO;
import com.example.demo.dtos.PedidoDTO;
import com.example.demo.entities.PedidosEntity;
import com.example.demo.mapper.PedidoMapper;
import com.example.demo.services.PedidosService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidosController {
    private final PedidosService service;

    @GetMapping
    public List<PedidosEntity> getPedidos(){
        return service.getPedidos();
    }

    @PostMapping
    public OkDTO insertProduct(@RequestBody PedidoDTO pedido){
        return new OkDTO(service.insertPedido(
                PedidoMapper.INSTANCE.toProductEntity(pedido)
        ),"pedido insertado correctamente");
    }
}
