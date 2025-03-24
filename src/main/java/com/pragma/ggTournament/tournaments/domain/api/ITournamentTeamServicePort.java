package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;

import java.util.List;

public interface ITournamentTeamServicePort {
    Long createTournamentTeam(TournamentTeam tournamentTeam);
    void updateTournamentTeam(TournamentTeam tournamentTeam);

    List<TournamentTeam> getListTeamByTournamentId(Long tournamentId);
}
