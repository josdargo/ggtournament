package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TournamentTeamRequest {
    private Long tournamentId;
    private Long teamId;
    private String teamState;
}
