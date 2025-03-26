package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.GameType;

import java.util.List;

public interface IGameTypeServicePort {
    GameType getGameTypeById(Long id);
    List<GameType> getListGameType();
}
