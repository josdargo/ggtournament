package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class MatchResponse {
    private String tournamentTitle;
    private String stage;
    private String matchState;
    private LocalDateTime matchDate;
    private String winnerTeamName;
    private String winnerTeamUrlPhoto;
    private Character groupStageName;
    private List<MatchTeamDetailDto> listTeams;
}
