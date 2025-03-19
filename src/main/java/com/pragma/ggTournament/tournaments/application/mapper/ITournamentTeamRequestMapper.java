package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.TournamentTeamRequest;
import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITournamentTeamRequestMapper {
    TournamentTeam toTournamentTeam(TournamentTeamRequest request);
}
