package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TournamentRequest {
    private Long creatorId;
    private String title;
    private String description;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime updatedAt;
    private int maxTeams;
    private String mode;
    private String type;
    private String rulesUrl;
    private String tournamentState;
}
