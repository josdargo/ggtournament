package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamUserRequest {
    private Long teamId;
    private Long userId;
    private String role;
}
