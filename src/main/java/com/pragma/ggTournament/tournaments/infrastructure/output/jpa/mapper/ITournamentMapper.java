package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITournamentMapper {
    TournamentEntity toEntity(Tournament tournament);
    List<Tournament> toListTournament(List<TournamentEntity> tournamentEntityList);
    Tournament toTournament(TournamentEntity tournamentEntity);
}
