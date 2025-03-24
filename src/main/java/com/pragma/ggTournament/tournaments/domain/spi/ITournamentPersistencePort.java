package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.Tournament;

import java.util.List;

public interface ITournamentPersistencePort {
    Long createTournament(Tournament tournament);
    void updateTournament(Tournament tournament);
    List<Tournament> getListTournamentByCreatorId(Long creatorId);
    Tournament getById(Long id);
    List<Tournament> getListTournamentByState(String tournamentState);

}
