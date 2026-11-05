package com.sena.controllabs.dto;

import java.time.LocalDateTime;

public record LoanResponse() {
        Long id,
        Long room_id,
        Long instructor_id,
        Long guarda_id,
        Integer numero_pc ,
        String status,
        LocalDateTime createdAt,
        LocalDateTime acceptedAt
}
