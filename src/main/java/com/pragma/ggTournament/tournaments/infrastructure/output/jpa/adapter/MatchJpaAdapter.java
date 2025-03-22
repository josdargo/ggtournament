package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.Match;
import com.pragma.ggTournament.tournaments.domain.spi.IMatchPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.IMatchMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.IMatchRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MatchJpaAdapter implements IMatchPersistencePort {

    private final IMatchRepository matchRepository;
    private final IMatchMapper matchMapper;

    @Override
    public List<Match> findByTournamentId(Long idTournament) {
        return matchMapper.toListMatch(matchRepository.findByTournamentId(idTournament).orElseThrow(() -> new RuntimeException("Error")));
    }

    @Override
    public List<Match> findAll() {
        return matchMapper.toListMatch(matchRepository.findAll());
    }

    @Override
    public Match findById(Long id) {
        return matchMapper.toMatch(matchRepository.findById(id).orElseThrow(() -> new RuntimeException("Error")));
    }

    @Override
    public Long createMatch(Match match) {
        return matchRepository.save(matchMapper.toEntity(match)).getId();
    }

    @Override
    public void updateMatch(Match match) {
        matchRepository.save(matchMapper.toEntity(match));
    }
}
