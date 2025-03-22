package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.TournamentModerator;
import com.pragma.ggTournament.tournaments.domain.spi.ITournamentModeratorPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.ITournamentModeratorMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.ITournamentModeratorRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TournamentModeratorJpaAdapter implements ITournamentModeratorPersistencePort {

    private final ITournamentModeratorRepository repository;
    private final ITournamentModeratorMapper mapper;

    @Override
    public Long createTournamentModerator(TournamentModerator tournamentModerator) {
        return repository.save(mapper.toEntity(tournamentModerator)).getId();
    }

    @Override
    public List<TournamentModerator> findByTournamentId(Long tournamentId) {
        return mapper.toListTournamentModerator(repository.findByTournamentId(tournamentId).orElseThrow());
    }

    @Override
    public TournamentModerator findByUserId(Long userId) {
        return null;
    }

    @Override
    public void deleteModeratorByUserId(Long userId) {

    }
}
