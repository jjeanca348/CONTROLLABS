package com.sena.controllabs.dto;

public record UserResponse() {
    Long id,
    String email,
    String nombre,
    String rol,
    Boolean activo,
    LocalDateTime created_at
}
