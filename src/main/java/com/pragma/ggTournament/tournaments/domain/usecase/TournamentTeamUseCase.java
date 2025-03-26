package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITournamentTeamServicePort;
import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;
import com.pragma.ggTournament.tournaments.domain.spi.ITournamentTeamPersistencePort;

import java.util.List;

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

    @Override
    public List<TournamentTeam> getListTeamByTournamentId(Long tournamentId) {
        return teamPersistencePort.getListTeamByTournamentId(tournamentId);
    }
}
