package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITeamUserServicePort;
import com.pragma.ggTournament.tournaments.domain.model.TeamUser;
import com.pragma.ggTournament.tournaments.domain.spi.ITeamUserPersistencePort;

import java.util.List;

public class TeamUserUseCase implements ITeamUserServicePort {

    private final ITeamUserPersistencePort teamUserPersistencePort;

    public TeamUserUseCase(ITeamUserPersistencePort teamUserPersistencePort){
        this.teamUserPersistencePort = teamUserPersistencePort;
    }


    @Override
    public Long createTeamUser(TeamUser teamUser) {
        return teamUserPersistencePort.createTeamUser(teamUser);
    }

    @Override
    public List<TeamUser> getByUserId(Long userId) {
        return teamUserPersistencePort.getByUserId(userId);
    }

    @Override
    public List<TeamUser> getByTeamId(Long teamId) {
        return teamUserPersistencePort.getByTeamId(teamId);
    }

    @Override
    public List<TeamUser> getByRole(String role) {
        return teamUserPersistencePort.getByRole(role);
    }

    @Override
    public List<TeamUser> getListByTeamIds(List<Long> teamIds) {
        return teamUserPersistencePort.getListByTeamIds(teamIds);
    }
}
