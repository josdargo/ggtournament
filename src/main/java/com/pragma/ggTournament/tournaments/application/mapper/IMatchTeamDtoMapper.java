package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.MatchTeamDto;
import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMatchTeamDtoMapper {
    List<MatchTeamDto> toDto(List<MatchTeam> matchTeams);
    List<MatchTeam> toListMatchTeam(List<MatchTeamDto> matchTeamDtos);
    MatchTeam toMatchTeam(MatchTeamDto request);

}
