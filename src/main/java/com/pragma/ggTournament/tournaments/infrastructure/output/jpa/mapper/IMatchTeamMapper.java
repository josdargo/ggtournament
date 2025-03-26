package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.MatchTeamEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IMatchTeamMapper {
    MatchTeam toMatchTeam(MatchTeamEntity matchTeamEntity);
    List<MatchTeam> toListMatchTeam(List<MatchTeamEntity> matchTeamEntityList);
    MatchTeamEntity toEntity(MatchTeam matchTeam);
}
