package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TournamentModeratorRequest {
    private Long tournamentId;
    private Long userId;
}
