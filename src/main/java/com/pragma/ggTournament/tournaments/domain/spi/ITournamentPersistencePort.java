package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.Tournament;

import java.util.List;

public interface ITournamentPersistencePort {
    Long createTournament(Tournament tournament);
    void updateTournament(Tournament tournament);
    List<Tournament> findByCreatorId(Long creatorId);
    Tournament findById(Long id);
}
