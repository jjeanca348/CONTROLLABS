package com.sena.controllabs.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "rooms")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true, length = 100)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String bloque;

    @Column(name = "capacidad_pcs", nullable = false)
    private Integer capacidadPcs;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private RoomStatus estado = RoomStatus.OPERATIVO;

    public enum RoomStatus {
        OPERATIVO, MANTENIMIENTO, INACTIVO
    }
}