package com.matiox23.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "productos")
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_producto;



    @Column(name = "nombre_producto", nullable = false, length = 50)
    @NotBlank(message = "El nombre del Producto no puede estar vació")
    private String nombreProducto;


    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetalleAlquiler> detalleAlquiler;


}

