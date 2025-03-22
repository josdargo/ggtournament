package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;
import com.pragma.ggTournament.tournaments.domain.spi.ITournamentTeamPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.ITournamentTeamMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.ITournamentTeamRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TournamentTeamJpaAdapter implements ITournamentTeamPersistencePort {

    private final ITournamentTeamRepository repository;
    private final ITournamentTeamMapper mapper;

    @Override
    public Long createTournamentTeam(TournamentTeam tournamentTeam) {
        return repository.save(mapper.toEntity(tournamentTeam)).getId();
    }

    @Override
    public void updateTournamentTeam(TournamentTeam tournamentTeam) {
        repository.save(mapper.toEntity(tournamentTeam));
    }
}
