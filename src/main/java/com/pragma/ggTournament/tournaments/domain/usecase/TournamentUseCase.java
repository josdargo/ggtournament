package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.ITournamentServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import com.pragma.ggTournament.tournaments.domain.spi.ITournamentPersistencePort;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class TournamentUseCase implements ITournamentServicePort {

    private final ITournamentPersistencePort tournamentPersistencePort;

    public TournamentUseCase(ITournamentPersistencePort tournamentPersistencePort){
        this.tournamentPersistencePort = tournamentPersistencePort;
    }

    @Override
    public Long createTournament(Tournament tournament, MultipartFile file) {
        return tournamentPersistencePort.createTournament(tournament,file);
    }

    @Override
    public void updateTournament(Tournament tournament) {
        tournamentPersistencePort.updateTournament(tournament);
    }

    @Override
    public List<Tournament> getListTournamentByCreatorId(Long creatorId) {
        return tournamentPersistencePort.getListTournamentByCreatorId(creatorId);
    }

    @Override
    public Tournament getById(Long id) {
        return tournamentPersistencePort.getById(id);
    }

    @Override
    public List<Tournament> getListTournamentByState(String tournamentState) {
        return tournamentPersistencePort.getListTournamentByState(tournamentState);
    }

}
