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
    public List<MatchTeam> getListByMatchId(Long matchId) {
        return matchTeamPersistencePort.getListByMatchId(matchId);
    }

    @Override
    public List<MatchTeam> getListByTeamId(Long teamId) {
        return matchTeamPersistencePort.getListByTeamId(teamId);
    }

    @Override
    public List<MatchTeam> getAll() {
        return matchTeamPersistencePort.getAll();
    }

    @Override
    public List<MatchTeam> getListByMatchIds(List<Long> matchIds) {
        return matchTeamPersistencePort.getListByMatchIds(matchIds);
    }
}
