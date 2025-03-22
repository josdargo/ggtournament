package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.TeamUser;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TeamUserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITeamUserMapper {
    TeamUserEntity toEntity(TeamUser teamUser);
    List<TeamUser> toListTeamUser(List<TeamUserEntity> userEntityList);
}
