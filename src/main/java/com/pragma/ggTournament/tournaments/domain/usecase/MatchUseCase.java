package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.IMatchServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Match;
import com.pragma.ggTournament.tournaments.domain.spi.IMatchPersistencePort;

import java.util.List;

public class MatchUseCase implements IMatchServicePort {

    private final IMatchPersistencePort matchPersistencePort;

    public MatchUseCase(IMatchPersistencePort matchPersistencePort){
        this.matchPersistencePort = matchPersistencePort;
    }
    @Override
    public List<Match> getListByTournamentId(Long idTournament) {
        return matchPersistencePort.getListByTournamentId(idTournament);
    }

    @Override
    public List<Match> findAll() {
        return matchPersistencePort.findAll();
    }

    @Override
    public Match findById(Long id) {
        return matchPersistencePort.findById(id);
    }

    @Override
    public Long createMatch(Match match) {
        return matchPersistencePort.createMatch(match);
    }

    @Override
    public void updateMatch(Match match) {
        matchPersistencePort.updateMatch(match);
    }
}
