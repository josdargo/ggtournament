package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.domain.spi.ITeamPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.ITeamMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TeamJpaAdapter implements ITeamPersistencePort {
    private final ITeamRepository repository;
    private final ITeamMapper mapper;
    @Override
    public Long createTeam(Team team) {
        return repository.save(mapper.toEntity(team)).getId();
    }

    @Override
    public void updateTeam(Team team) {
        repository.save(mapper.toEntity(team));
    }

    @Override
    public List<Team> findByCreatorId(Long creatorId) {
        return mapper.toListTeam(repository.findByCreatorId(creatorId).orElseThrow(() -> new RuntimeException("Error")));
    }

    @Override
    public List<Team> findAll() {
        return mapper.toListTeam(repository.findAll());
    }
}
