package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITournamentModeratorServicePort;
import com.pragma.ggTournament.tournaments.domain.model.TournamentModerator;
import com.pragma.ggTournament.tournaments.domain.spi.ITournamentModeratorPersistencePort;

import java.util.List;

public class TournamentModeratorUseCase implements ITournamentModeratorServicePort {

    private final ITournamentModeratorPersistencePort tournamentModeratorPersistencePort;

    public TournamentModeratorUseCase(ITournamentModeratorPersistencePort tournamentModeratorPersistencePort){
        this.tournamentModeratorPersistencePort = tournamentModeratorPersistencePort;
    }

    @Override
    public Long createTournamentModerator(TournamentModerator tournamentModerator) {
        return tournamentModeratorPersistencePort.createTournamentModerator(tournamentModerator);
    }

    @Override
    public List<TournamentModerator> findByTournamentId(Long tournamentId) {
        return tournamentModeratorPersistencePort.findByTournamentId(tournamentId);
    }

    @Override
    public TournamentModerator findByUserId(Long userId) {
        return tournamentModeratorPersistencePort.findByUserId(userId);
    }

    @Override
    public void deleteModeratorByUserId(Long userId) {
        tournamentModeratorPersistencePort.deleteModeratorByUserId(userId);
    }
}
