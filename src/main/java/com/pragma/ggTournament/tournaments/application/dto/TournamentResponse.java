package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class TournamentResponse {
    private String creatorUserName;
    private String title;
    private String description;
    private CategoryDto category;
    private GameTypeDto gameType;
    private String rulesUrl;
    private String tournamentState;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<UserDto> lstModerators;
}
