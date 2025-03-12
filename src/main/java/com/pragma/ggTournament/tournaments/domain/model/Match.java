package com.pragma.ggTournament.tournaments.domain.model;

import java.time.LocalDateTime;

public class Match {
    private Long id;
    private Long tournamentId;
    private String stage;
    private String matchState;
    private LocalDateTime matchDate;
    private Long winnerTeamId;
}
