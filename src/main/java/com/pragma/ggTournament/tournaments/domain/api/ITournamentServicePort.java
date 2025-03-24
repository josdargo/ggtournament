package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Tournament;

import java.util.List;

public interface ITournamentServicePort {
    Long createTournament(Tournament tournament);
    void updateTournament(Tournament tournament);
    List<Tournament> getListTournamentByCreatorId(Long creatorId);
    Tournament getById(Long id);
    List<Tournament> getListTournamentByState(String tournamentState);
}
