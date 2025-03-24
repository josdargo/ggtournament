package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TeamEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITeamMapper {
    List<Team> toListTeam(List<TeamEntity> teamEntityList);
    TeamEntity toEntity(Team team);
    Team toTeam(TeamEntity teamEntity);

}
