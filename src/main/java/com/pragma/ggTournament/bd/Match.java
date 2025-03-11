package com.pragma.ggTournament.bd;

import java.time.LocalDateTime;

public class Match {
    private Long id;
    private Long tournamentId;
    private String stage;
    private String matchState;
    private LocalDateTime matchDate;
    private Long winnerTeamId;
}
