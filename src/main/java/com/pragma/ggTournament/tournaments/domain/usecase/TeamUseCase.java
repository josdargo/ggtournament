package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITeamServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.domain.spi.ITeamPersistencePort;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class TeamUseCase implements ITeamServicePort {

    private final ITeamPersistencePort teamPersistencePort;

    public TeamUseCase(ITeamPersistencePort teamPersistencePort){
        this.teamPersistencePort = teamPersistencePort;
    }

    @Override
    public Long createTeam(Team team, MultipartFile imageFile) {
        return teamPersistencePort.createTeam(team, imageFile);
    }

    @Override
    public void updateTeam(Team team) {
        teamPersistencePort.updateTeam(team);
    }

    @Override
    public List<Team> getByCreatorId(Long creatorId) {
        return teamPersistencePort.getByCreatorId(creatorId);
    }

    @Override
    public List<Team> getAll() {
        return teamPersistencePort.getAll();
    }

    @Override
    public Team getById(Long id) {
        return teamPersistencePort.getById(id);
    }

    @Override
    public List<Team> getListByIds(List<Long> teamIds) {
        return teamPersistencePort.getListByIds(teamIds);
    }
}
