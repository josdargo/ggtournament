package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Tournament;

import java.util.List;

public interface ITournamentServicePort {
    Long createTournament(Tournament tournament);
    void updateTournament(Tournament tournament);
    List<Tournament> findByCreatorId(Long creatorId);
    Tournament findById(Long id);
}
