package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.Match;

import java.util.List;

public interface IMatchPersistencePort {
    List<Match> findByTournamentId(Long idTournament);
    List<Match> findAll();
    Match findById(Long id);
    Long createMatch(Match match);
    void updateMatch(Match match);
}
