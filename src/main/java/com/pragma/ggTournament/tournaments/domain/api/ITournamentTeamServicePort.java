package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;

public interface ITournamentTeamServicePort {
    Long createTournamentTeam(TournamentTeam tournamentTeam);
    void updateTournamentTeam(TournamentTeam tournamentTeam);

}
