package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "pedidos")
public class PedidosEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Double id;

    @Column(name = "detalle", nullable = false, length = 100)
    private String detalle;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private ProductosEntity idProducto;

    @Column(name = "fecha_creacion", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_creacion;
}
