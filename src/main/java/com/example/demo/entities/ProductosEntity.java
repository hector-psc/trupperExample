package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "productos")
public class ProductosEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Double id;

    @Column(name = "detalle", nullable = false, length = 100)
    private String detalle;

    @Column(name = "fecha_creacion", updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_creacion;

    @OneToMany(mappedBy = "idProducto")
    private Set<PedidosEntity> pedidos;
}
