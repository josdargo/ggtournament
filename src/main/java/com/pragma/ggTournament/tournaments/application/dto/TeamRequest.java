package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
@Getter
@Setter
public class TeamRequest {
    private String name;
    private String description;
    private Long creatorId;
    private MultipartFile logoFile;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
