package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;

import java.util.List;

public interface IMatchTeamPersistencePort {
    Long createMatchTeam(MatchTeam matchTeam);
    List<MatchTeam> findByMatchId(Long matchId);
    List<MatchTeam> findByTeamId(Long teamId);
}