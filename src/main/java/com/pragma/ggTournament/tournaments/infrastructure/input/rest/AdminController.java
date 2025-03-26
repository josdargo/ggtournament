package com.pragma.ggTournament.tournaments.infrastructure.input.rest;

import com.pragma.ggTournament.tournaments.application.dto.UserRequest;
import com.pragma.ggTournament.tournaments.application.handler.IAdminHandler;
import com.pragma.ggTournament.tournaments.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final IAdminHandler adminHandler;

    @PostMapping("/users")
    public ResponseEntity<Long> createUser(@ModelAttribute UserRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(adminHandler.createUser(request));
    }

    @PutMapping("/users")
    public ResponseEntity<Void> updateUser(@RequestBody User request) {
        adminHandler.updateUser(request);
        return ResponseEntity.noContent().build();
    }
}

