package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ITournamentPersistencePort {
    Long createTournament(Tournament tournament, MultipartFile file);
    void updateTournament(Tournament tournament);
    List<Tournament> getListTournamentByCreatorId(Long creatorId);
    Tournament getById(Long id);
    List<Tournament> getListTournamentByState(String tournamentState);

}
