package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.TeamUser;
import com.pragma.ggTournament.tournaments.domain.spi.ITeamUserPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.ITeamUserMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.ITeamUserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TeamUserJpaAdapter implements ITeamUserPersistencePort {

    private final ITeamUserRepository repository;
    private final ITeamUserMapper mapper;


    @Override
    public Long createTeamUser(TeamUser teamUser) {
        return repository.save(mapper.toEntity(teamUser)).getId();
    }

    @Override
    public List<TeamUser> getByUserId(Long userId) {
        return mapper.toListTeamUser(repository.findByUserId(userId).orElseThrow());
    }

    @Override
    public List<TeamUser> getByTeamId(Long teamId) {
        return mapper.toListTeamUser(repository.findByTeamId(teamId).orElseThrow());
    }

    @Override
    public List<TeamUser> getByRole(String role) {
        return mapper.toListTeamUser(repository.findByRole(role).orElseThrow());

    }

    @Override
    public List<TeamUser> getListByTeamIds(List<Long> teamIds) {
        return mapper.toListTeamUser(repository.findByTeamIdIn(teamIds).orElseThrow());
    }
}
