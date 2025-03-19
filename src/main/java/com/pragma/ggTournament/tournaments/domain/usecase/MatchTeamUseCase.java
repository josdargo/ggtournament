package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.IMatchTeamServicePort;
import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;

import com.pragma.ggTournament.tournaments.domain.spi.IMatchTeamPersistencePort;

import java.util.List;

public class MatchTeamUseCase implements IMatchTeamServicePort {

    private final IMatchTeamPersistencePort matchTeamPersistencePort;

    public MatchTeamUseCase(IMatchTeamPersistencePort matchTeamPersistencePort){
        this.matchTeamPersistencePort = matchTeamPersistencePort;
    }

    @Override
    public void createMatchTeam(MatchTeam matchTeam) {
        matchTeamPersistencePort.createMatchTeam(matchTeam);
    }

    @Override
    public List<MatchTeam> findByMatchId(Long matchId) {
        return matchTeamPersistencePort.findByMatchId(matchId);
    }

    @Override
    public List<MatchTeam> findByTeamId(Long teamId) {
        return matchTeamPersistencePort.findByTeamId(teamId);
    }
}
