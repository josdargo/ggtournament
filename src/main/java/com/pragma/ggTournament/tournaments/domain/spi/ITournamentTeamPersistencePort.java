package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;

import java.util.List;

public interface ITournamentTeamPersistencePort {
    Long createTournamentTeam(TournamentTeam tournamentTeam);
    void updateTournamentTeam(TournamentTeam tournamentTeam);
    List<TournamentTeam> getListTeamByTournamentId(Long tournamentId);
}
