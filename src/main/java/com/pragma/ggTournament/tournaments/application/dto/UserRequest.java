package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String surname;
    private String username;
    private String email;
    private String passwordHash;
    private MultipartFile photoFile;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer accessLevel;
}
