package com.matiox23.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;

    @Column(name = "nombre_cliente", nullable = false, length = 100)
    @NotBlank(message = "El nombre del cliente no puede estar vacío")
    private String nombreCliente;


    @Column(name = "direccion_cliente", nullable = false, length = 100)
    @NotBlank(message = "La dirección del cliente no puede estar vació")
    private String dieccion;


    @Column(name = "telefono_cliente", nullable = false, length = 9)
    @NotBlank(message = "El telefono del cliente no puede estar vació")
    private int telefono;







}
