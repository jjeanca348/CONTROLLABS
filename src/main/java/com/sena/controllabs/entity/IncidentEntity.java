package com.sena.controllabs.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "incidents")
@Getter @Setter
@AllArgsConstructor
public class IncidentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_id", nullable = false)
    private RoomEntity equipmentId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "reported_by", nullable = false)
    private RoomEntity reporteBy;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private IncidentPrioridad prioridad;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private IncidentStatus estado = IncidentStatus.PENDIENTE;

    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();

    public enum IncidentPrioridad {
        BAJA, MEDIA, ALTA
    }

    public enum IncidentStatus {
        PENDIENTE, EN_PROCESO, RESUELTA
    }
}
