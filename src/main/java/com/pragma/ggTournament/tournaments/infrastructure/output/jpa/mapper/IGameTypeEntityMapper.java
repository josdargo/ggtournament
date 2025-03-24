package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.GameType;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.GameTypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IGameTypeEntityMapper {
    GameType toGameType(GameTypeEntity gameType);
    List<GameType> toListGameType(List<GameTypeEntity> gameTypeEntityList);
}
