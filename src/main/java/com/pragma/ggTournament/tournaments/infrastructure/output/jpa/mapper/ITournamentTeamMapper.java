package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.TournamentTeam;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentTeamEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITournamentTeamMapper {
    TournamentTeamEntity toEntity(TournamentTeam tournamentTeam);
    List<TournamentTeam> toListTournamentTeam(List<TournamentTeamEntity> tournamentTeamEntityList);
}
