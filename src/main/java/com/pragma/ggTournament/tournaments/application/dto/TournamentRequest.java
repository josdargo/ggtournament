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
    private Long categoryId;
    private Long gameTypeId;
    private String rulesUrl;
    private String tournamentState;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
