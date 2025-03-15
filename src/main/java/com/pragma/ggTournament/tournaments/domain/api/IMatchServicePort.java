package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Match;

import java.util.List;

public interface IMatchServicePort {
    List<Match> findByTournamentId(Long idTournament);
    List<Match> findAll();
}
