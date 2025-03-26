package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.IGameTypeServicePort;
import com.pragma.ggTournament.tournaments.domain.model.GameType;
import com.pragma.ggTournament.tournaments.domain.spi.IGameTypePersistencePort;

import java.util.List;

public class GameTypeUseCase implements IGameTypeServicePort {

    private final IGameTypePersistencePort gameTypePersistencePort;

    public GameTypeUseCase(IGameTypePersistencePort gameTypePersistencePort){
        this.gameTypePersistencePort = gameTypePersistencePort;
    }

    @Override
    public GameType getGameTypeById(Long id) {
        return gameTypePersistencePort.getGameTypeById(id);
    }

    @Override
    public List<GameType> getListGameType() {
        return gameTypePersistencePort.getListGameType();
    }
}
