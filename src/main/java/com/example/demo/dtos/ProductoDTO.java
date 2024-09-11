package com.example.demo.dtos;


import com.example.demo.entities.ProductosEntity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {
    private Double id;

    @NotNull
    private String detalle;

    private Date fecha_creacion;

    public ProductoDTO(ProductosEntity entity){
        this.id = entity.getId();
        this.detalle = entity.getDetalle();
        this.fecha_creacion = entity.getFecha_creacion();
    }
}
