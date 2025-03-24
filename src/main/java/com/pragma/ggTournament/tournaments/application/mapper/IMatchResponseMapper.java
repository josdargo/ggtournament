package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.MatchResponse;
import com.pragma.ggTournament.tournaments.application.dto.MatchTeamDetailDto;
import com.pragma.ggTournament.tournaments.domain.model.Match;
import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMatchResponseMapper {

    IMatchTeamDetailDto INSTANCE_MATCH_TEAM_DETAIL = Mappers.getMapper(IMatchTeamDetailDto.class);

    @Mapping(source = "tournamentTitle", target = "tournamentTitle")
    MatchResponse toResponse(Match match, String tournamentTitle);

    default List<MatchResponse> toListMatchResponse(
            List<Match> matches,
            Tournament tournament,
            List<MatchTeam> matchTeamList,
            List<Team> teamList) {

        Map<Long, Team> teamMap = teamList.stream()
                .collect(Collectors.toMap(Team::getId, team -> team));

        return matches.stream()
                .map(match -> {

                    Team winnerTeam = teamMap.get(match.getWinnerTeamId());

                    List<MatchTeam> filteredMatchTeams = matchTeamList.stream()
                            .filter(mt -> mt.getMatchId().equals(match.getId()))
                            .toList();

                    List<MatchTeamDetailDto> matchTeamDetails = INSTANCE_MATCH_TEAM_DETAIL.toListMatchTeamDetailDto(filteredMatchTeams, teamList);

                    MatchResponse matchResponse = new MatchResponse();
                    matchResponse.setTournamentTitle(tournament.getTitle());
                    matchResponse.setStage(match.getStage());
                    matchResponse.setMatchState(match.getMatchState());
                    matchResponse.setMatchDate(match.getMatchDate());
                    matchResponse.setGroupStageName(match.getGroupStageName());
                    matchResponse.setListTeams(matchTeamDetails);

                    if (winnerTeam != null) {
                        matchResponse.setWinnerTeamName(winnerTeam.getName());
                        matchResponse.setWinnerTeamUrlPhoto(winnerTeam.getLogoUrl());
                    }
                    return matchResponse;
                })
                .toList();
    }
}
