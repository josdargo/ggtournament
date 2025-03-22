package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.TournamentModerator;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentModeratorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITournamentModeratorMapper {
    TournamentModeratorEntity toEntity(TournamentModerator tournamentModerator);
    List<TournamentModerator> toListTournamentModerator(List<TournamentModeratorEntity> tournamentModeratorEntityList);
}
