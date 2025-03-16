package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class MatchRequest {
    private Long tournamentId;
    private String stage;
    private String matchState;
    private LocalDateTime matchDate;
    private Long winnerTeamId;
    private Character groupStageName;
    private List<MatchTeamDto> lstMatchTeamDto;
}
