package com.matiox23.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "detalle_alquiler")
public class DetalleAlquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_detalle_alquiler;


    @Column(name = "cantidad", nullable = false)
    @NotBlank(message = "La cantidad no debe estar vació")
    private int cantidad;


    @Column(name = "precio_unitario", nullable = false)
    @NotBlank(message = "El precio unitario no debe estar vació")
    private float precioUnitario;

    @Column(name = "dias", nullable = false)
    private int dias;

    @Column(name = "total", nullable = false)
    private float total;

    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "alquiler_id", referencedColumnName = "id_alquiler", foreignKey = @ForeignKey(name = "FK_alquiler"))
    private Alquiler alquiler;

    //@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    //@JoinColumn(name = "producto_id", referencedColumnName = "id_producto", foreignKey = @ForeignKey(name = "FK_producto"))
    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id_producto", foreignKey = @ForeignKey(name = "FK_producto"))
    public Producto producto;




}
