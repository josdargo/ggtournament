package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;

import java.util.List;

public interface IMatchTeamServicePort {
    void createMatchTeam(MatchTeam matchTeam);
    List<MatchTeam> findByMatchId(Long matchId);
    List<MatchTeam> findByTeamId(Long teamId);
}