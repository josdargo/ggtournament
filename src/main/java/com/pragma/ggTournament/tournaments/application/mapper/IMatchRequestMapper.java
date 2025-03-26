package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.MatchRequest;
import com.pragma.ggTournament.tournaments.domain.model.Match;
import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMatchRequestMapper {
    Match toMatch(MatchRequest matchRequest);
    //List<MatchTeam> toListMatchTeam(MatchRequest matchRequest);
}
