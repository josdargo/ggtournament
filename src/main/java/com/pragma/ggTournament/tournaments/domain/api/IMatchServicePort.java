package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Match;

import java.util.List;

public interface IMatchServicePort {
    List<Match> getListByTournamentId(Long idTournament);
    List<Match> findAll();
    Match findById(Long id);
    Long createMatch(Match match);
    void updateMatch(Match match);
}
