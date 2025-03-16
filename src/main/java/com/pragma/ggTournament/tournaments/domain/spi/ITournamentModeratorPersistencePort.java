package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.TournamentModerator;

import java.util.List;

public interface ITournamentModeratorPersistencePort {
    Long createTournamentModerator(TournamentModerator tournamentModerator);
    List<TournamentModerator> findByTournamentId(Long tournamentId);
    TournamentModerator findByUserId(Long userId);
    void deleteModeratorByUserId(Long userId);
}
