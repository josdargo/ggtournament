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
    public List<MatchTeam> findByMatchId(Long matchId) {
        return mapper.toListMatchTeam(repository.findByMatchId(matchId));
    }

    @Override
    public List<MatchTeam> findByTeamId(Long teamId) {
        return mapper.toListMatchTeam(repository.findByTeamId(teamId));
    }
}
