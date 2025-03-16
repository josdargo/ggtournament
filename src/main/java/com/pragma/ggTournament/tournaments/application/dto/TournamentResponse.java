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
    private String category;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int maxTeams;
    private String mode;
    private String type;
    private String rulesUrl;
    private String status;
    private String statusDescription;
    private List<UserDto> lstModerators;
}
