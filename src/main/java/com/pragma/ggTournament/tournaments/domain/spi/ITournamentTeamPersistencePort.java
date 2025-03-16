package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;

public interface ITournamentTeamPersistencePort {
    Long createTournamentTeam(TournamentTeam tournamentTeam);
    void updateTournamentTeam(TournamentTeam tournamentTeam);

}
