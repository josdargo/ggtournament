package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.MatchResponse;
import com.pragma.ggTournament.tournaments.domain.model.Match;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Objects;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMatchResponseMapper {

    @Mapping(source = "tournamentTitle", target = "tournamentTitle")
    MatchResponse toResponse(Match match, String tournamentTitle);

    default List<MatchResponse> toListMatchResponse(List<Match> matches, List<Tournament> tournaments){
        return matches.stream()
                .map(match->{
                    MatchResponse matchResponse = new MatchResponse();
                    matchResponse.setTournamentTitle(Objects.requireNonNull(tournaments.stream()
                            .filter(tournament ->
                                    tournament.getId().equals(match.getTournamentId())
                            ).findFirst().orElse(null)).getTitle());
                    matchResponse.setStage(match.getStage());
                    matchResponse.setMatchState(match.getMatchState());
                    matchResponse.setMatchDate(match.getMatchDate());
                    matchResponse.setWinnerTeamId(match.getWinnerTeamId());
                    matchResponse.setGroupStageName(match.getGroupStageName());
                    return matchResponse;
                }).toList();
    }

}
