package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.GameType;
import com.pragma.ggTournament.tournaments.domain.spi.IGameTypePersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.IGameTypeMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.IGameTypeRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GameTypeJpaAdapter implements IGameTypePersistencePort {

    private final IGameTypeRepository gameTypeRepository;
    private final IGameTypeMapper gameTypeMapper;

    @Override
    public GameType getGameTypeById(Long id) {
        return gameTypeMapper.toGameType(gameTypeRepository.findById(id).orElseThrow());
    }

    @Override
    public List<GameType> getListGameType() {
        return gameTypeMapper.toListGameType(gameTypeRepository.findAll());
    }
}
