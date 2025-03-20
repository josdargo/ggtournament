package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.TournamentResponse;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import com.pragma.ggTournament.tournaments.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Objects;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITournamentResponseMapper {

    IUserDtoMapper INSTANCE_USER = Mappers.getMapper(IUserDtoMapper.class);


    default List<TournamentResponse> toResponse(List<Tournament> tournaments, List<User> users){
        return tournaments.stream()
                .map(tournament -> {
                    TournamentResponse response = new TournamentResponse();
                    response.setCreatorUserName(
                            Objects.requireNonNull(users.stream().filter(user ->
                                user.getId().equals(tournament.getCreatorId()))
                                .findFirst().orElse(null)).getUsername()
                    );
                    response.setTitle(tournament.getTitle());
                    response.setDescription(tournament.getDescription());
                    response.setCategory(tournament.getCategory());
                    response.setStartDate(tournament.getStartDate());
                    response.setEndDate(tournament.getEndDate());
                    response.setMaxTeams(tournament.getMaxTeams());
                    response.setMode(tournament.getMode());
                    response.setType(tournament.getType());
                    response.setRulesUrl(tournament.getRulesUrl());
                    response.setTournamentState(tournament.getTournamentState());
                    //response.setLstModerators()...
                    return response;
                }).toList();
    };
}
