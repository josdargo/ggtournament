package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;

import java.util.List;

public interface IMatchTeamServicePort {
    void createMatchTeam(MatchTeam matchTeam);
    List<MatchTeam> getListByMatchId(Long matchId);
    List<MatchTeam> getListByTeamId(Long teamId);
    List<MatchTeam> getAll();

    List<MatchTeam> getListByMatchIds(List<Long> matchIds);
}