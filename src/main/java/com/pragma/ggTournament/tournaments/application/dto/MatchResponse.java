package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MatchResponse {
    private String tournamentTitle;
    private String stage;
    private String matchState;
    private LocalDateTime matchDate;
    private Long winnerTeamId;
    private Character groupStageName;
}
