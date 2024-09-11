package com.example.demo.dtos;

import com.example.demo.entities.PedidosEntity;
import com.example.demo.entities.ProductosEntity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {
    private Double id;
    @NotNull
    @Size(max = 100, message = "Max lenght 100")
    private String detalle;

    @NotNull
    private int cantidad;

    @NotNull
    private ProductosEntity idProducto;

    private Date fecha_creacion;

    public PedidoDTO(PedidosEntity entity){
        this.id = entity.getId();
        this.detalle = entity.getDetalle();
        this.cantidad = entity.getCantidad();
        this.fecha_creacion = entity.getFecha_creacion();
        this.idProducto = entity.getIdProducto();
    }
}
