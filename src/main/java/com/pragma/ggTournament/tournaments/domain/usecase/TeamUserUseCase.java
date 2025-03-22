package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITeamServicePort;
import com.pragma.ggTournament.tournaments.domain.api.ITeamUserServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.domain.model.TeamUser;
import com.pragma.ggTournament.tournaments.domain.spi.ITeamPersistencePort;
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
    public List<TeamUser> findByUserId(Long userId) {
        return teamUserPersistencePort.findByUserId(userId);
    }

    @Override
    public List<TeamUser> findByTeamId(Long teamId) {
        return teamUserPersistencePort.findByTeamId(teamId);
    }

    @Override
    public List<TeamUser> findByRole(String role) {
        return teamUserPersistencePort.findByRole(role);
    }
}
