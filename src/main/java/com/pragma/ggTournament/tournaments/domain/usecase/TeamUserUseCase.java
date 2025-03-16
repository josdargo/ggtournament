package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITeamServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.domain.spi.ITeamPersistencePort;

import java.util.List;

public class TeamUserUseCase implements ITeamServicePort {

    private final ITeamPersistencePort teamPersistencePort;

    public TeamUserUseCase(ITeamPersistencePort teamPersistencePort){
        this.teamPersistencePort = teamPersistencePort;
    }

    @Override
    public Long createTeam(Team team) {
        return teamPersistencePort.createTeam(team);
    }

    @Override
    public void updateTeam(Team team) {
        teamPersistencePort.updateTeam(team);
    }

    @Override
    public List<Team> findByCreatorId(Long creatorId) {
        return teamPersistencePort.findByCreatorId(creatorId);
    }

    @Override
    public List<Team> findAll() {
        return teamPersistencePort.findAll();
    }
}
