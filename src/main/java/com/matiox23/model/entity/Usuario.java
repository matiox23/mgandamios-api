package com.matiox23.model.entity;


import com.matiox23.model.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "correo", nullable = false)
    @NotBlank(message = "El correo no puede estar vacío")
    @Email(message = "El correo debe tener un formato válido")
    private String correo;

    @Column(name = "nombre_de_usuario", nullable = false)
    @NotBlank(message = "El nombre de Usuario no puede estar vacío")
    private  String nombreDeUsuario;


    @Column(name = "fecha_de_creacion", nullable = false)
    private LocalDateTime fechaDeCreacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;



}
