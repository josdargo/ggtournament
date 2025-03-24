package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;
import com.pragma.ggTournament.tournaments.domain.spi.IMatchTeamPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.IMatchTeamMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.IMatchTeamRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MatchTeamJpaAdapter implements IMatchTeamPersistencePort {

    private final IMatchTeamRepository repository;
    private final IMatchTeamMapper mapper;

    @Override
    public void createMatchTeam(MatchTeam matchTeam) {
        repository.save(mapper.toEntity(matchTeam));
    }

    @Override
    public List<MatchTeam> getListByMatchId(Long matchId) {
        return mapper.toListMatchTeam(repository.findByMatchId(matchId).orElseThrow(() -> new RuntimeException("Error")));
    }

    @Override
    public List<MatchTeam> getListByTeamId(Long teamId) {
        return mapper.toListMatchTeam(repository.findByTeamId(teamId).orElseThrow(() -> new RuntimeException("Error")));
    }

    @Override
    public List<MatchTeam> getAll() {
        return mapper.toListMatchTeam(repository.findAll());
    }

    @Override
    public List<MatchTeam> getListByMatchIds(List<Long> matchIds) {
        return mapper.toListMatchTeam(repository.findByMatchIdIn(matchIds).orElseThrow(() -> new RuntimeException("Error")));
    }
}
