package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.TournamentModeratorRequest;
import com.pragma.ggTournament.tournaments.application.dto.TournamentRequest;
import com.pragma.ggTournament.tournaments.application.dto.TournamentTeamRequest;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;

public interface ITournamentHandler {
    Long createTournament(TournamentRequest request);
    void updateTournament(Tournament request);
    void addTeamToTournament(TournamentTeamRequest request);
    void addModeratorsToTournament(TournamentModeratorRequest request);
}
