package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.TournamentModerator;

import java.util.List;

public interface ITournamentModeratorServicePort {
    Long createTournamentModerator(TournamentModerator tournamentModerator);
    List<TournamentModerator> findByTournamentId(Long tournamentId);
    TournamentModerator findByUserId(Long userId);
    void deleteModeratorByUserId(Long userId);
    List<TournamentModerator> getListByTournamentIds(List<Long> tournamentIds);
}
