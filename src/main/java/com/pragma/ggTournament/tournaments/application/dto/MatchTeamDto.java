package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchTeamDto {
    private Long matchId;
    private Long teamId;
    private String comment;
}
