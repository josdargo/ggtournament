package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITournamentTeamServicePort;
import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;
import com.pragma.ggTournament.tournaments.domain.spi.ITournamentTeamPersistencePort;

public class TournamentTeamUseCase implements ITournamentTeamServicePort {

    private final ITournamentTeamPersistencePort teamPersistencePort;

    public TournamentTeamUseCase(ITournamentTeamPersistencePort teamPersistencePort){
        this.teamPersistencePort = teamPersistencePort;
    }

    @Override
    public Long createTournamentTeam(TournamentTeam tournamentTeam) {
        return teamPersistencePort.createTournamentTeam(tournamentTeam);
    }

    @Override
    public void updateTournamentTeam(TournamentTeam tournamentTeam) {
        teamPersistencePort.updateTournamentTeam(tournamentTeam);
    }
}
