package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String surname;
    private String username;
    private String email;
    private String passwordHash;
    private String profilePhotoUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer accessLevel;
}
