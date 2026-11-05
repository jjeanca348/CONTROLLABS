package com.sena.controllabs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.sena.controllabs.dto.RoomCreateRequest;
import com.sena.controllabs.dto.RoomResponse;

@RestController
public record UserController() {
    @Override
    public ResponseEntity<List<UserResponse>> getAllUsers(String rol) {
        UserResponse user = new UserResponse(
                1,
                "example@gmail.com"
        );
        return ResponseEntity.ok(List.of(sampleRoom, sampleRoom1));
    }
}
