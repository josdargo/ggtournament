package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.MatchRequest;
import com.pragma.ggTournament.tournaments.application.dto.MatchResponse;
import com.pragma.ggTournament.tournaments.application.dto.MatchTeamDto;
import com.pragma.ggTournament.tournaments.domain.model.Match;

import java.util.List;

public interface IMatchHandler {
    Long createMatch(MatchRequest request);
    void updateMatch(Match request);
    void addTeamToMatch(MatchTeamDto request);
    List<MatchResponse> getListMatchByTournamentId(Long tournamentId);
}
