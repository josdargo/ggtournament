package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.MatchTeamDetailDto;
import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMatchTeamDetailDto {
    default List<MatchTeamDetailDto> toListMatchTeamDetailDto(List<MatchTeam> matchTeamList, List<Team> teamList){
        Map<Long, Team> teamMap = teamList.stream()
                .collect(Collectors.toMap(Team::getId, team -> team));

        return matchTeamList.stream()
                .map(matchTeam -> {
                    Team team = teamMap.get(matchTeam.getTeamId());
                    if (team == null) {
                        return null;
                    }

                    MatchTeamDetailDto matchTeamDetail = new MatchTeamDetailDto();
                    matchTeamDetail.setNameTeam(team.getName());
                    matchTeamDetail.setLogoUrl(team.getLogoUrl());
                    matchTeamDetail.setComment(matchTeam.getComment());
                    return matchTeamDetail;
                })
                .filter(Objects::nonNull)
                .toList();
    }
}
