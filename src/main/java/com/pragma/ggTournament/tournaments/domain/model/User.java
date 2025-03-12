package com.pragma.ggTournament.tournaments.domain.model;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String email;
    private String passwordHash;
    private String profilePhotoUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
