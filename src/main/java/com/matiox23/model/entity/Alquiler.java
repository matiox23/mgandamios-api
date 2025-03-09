package com.matiox23.model.entity;

import com.matiox23.model.enums.PaymentStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "alquileres")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_alquiler;

    @ManyToOne
    @JoinColumn(name = "usuariod_id", referencedColumnName = "id_usuario", foreignKey = @ForeignKey(name = "FK_usuarios"))
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id_cliente", foreignKey = @ForeignKey(name = "FK_clientes"))
    private Cliente cliente;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;
}
