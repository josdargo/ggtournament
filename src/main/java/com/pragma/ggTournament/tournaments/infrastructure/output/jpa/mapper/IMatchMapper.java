package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.Match;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.MatchEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IMatchMapper {
    List<Match> toListMatch(List<MatchEntity> matchEntity);
    MatchEntity toEntity(Match match);
    Match toMatch(MatchEntity matchEntity);
}
