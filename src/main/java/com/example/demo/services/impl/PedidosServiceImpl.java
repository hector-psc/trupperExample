package com.example.demo.services.impl;

import com.example.demo.entities.PedidosEntity;
import com.example.demo.repositories.PedidosRepository;
import com.example.demo.services.PedidosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class PedidosServiceImpl implements PedidosService {
    private final PedidosRepository repository;

    @Override
    public List<PedidosEntity> getPedidos(){
        return repository.findAll();
    }

    @Override
    public boolean insertPedido(PedidosEntity entity){
        try{
            repository.save(entity);
        }catch (Exception e){
            throw e;
        }
        return true;
    }
}
