package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.GameType;

import java.util.List;

public interface IGameTypePersistencePort {
    GameType getGameTypeById(Long id);
    List<GameType> getListGameType();
}
