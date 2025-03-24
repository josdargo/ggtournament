package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITournamentServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import com.pragma.ggTournament.tournaments.domain.spi.ITournamentPersistencePort;

import java.util.List;

public class TournamentUseCase implements ITournamentServicePort {

    private final ITournamentPersistencePort tournamentPersistencePort;

    public TournamentUseCase(ITournamentPersistencePort tournamentPersistencePort){
        this.tournamentPersistencePort = tournamentPersistencePort;
    }

    @Override
    public Long createTournament(Tournament tournament) {
        return tournamentPersistencePort.createTournament(tournament);
    }

    @Override
    public void updateTournament(Tournament tournament) {
        tournamentPersistencePort.updateTournament(tournament);
    }

    @Override
    public List<Tournament> findByCreatorId(Long creatorId) {
        return tournamentPersistencePort.findByCreatorId(creatorId);
    }

    @Override
    public Tournament getById(Long id) {
        return tournamentPersistencePort.findById(id);
    }

    @Override
    public List<Tournament> getAllTournaments() {
        return tournamentPersistencePort.getAllTournaments();
    }

}
