package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.TournamentResponse;
import com.pragma.ggTournament.tournaments.application.dto.UserDto;
import com.pragma.ggTournament.tournaments.domain.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITournamentResponseMapper {

    IUserDtoMapper INSTANCE_USER = Mappers.getMapper(IUserDtoMapper.class);
    ICategoryMapper INSTANCE_CATEGORY = Mappers.getMapper(ICategoryMapper.class);
    IGameTypeMapper INSTANCE_GAME_TYPE = Mappers.getMapper(IGameTypeMapper.class);


    default List<TournamentResponse> toListTournamentResponse(List<Tournament> tournaments,
                                                              List<Category> categoryList,
                                                              List<GameType> gameTypeList,
                                                              List<TournamentModerator> tournamentModeratorList,
                                                              List<User> users) {
        return tournaments.stream().map(tournament -> {
            TournamentResponse response = new TournamentResponse();
            response.setTitle(tournament.getTitle());
            response.setDescription(tournament.getDescription());
            response.setRulesUrl(tournament.getRulesUrl());
            response.setTournamentState(tournament.getTournamentState());
            response.setStartDate(tournament.getStartDate());
            response.setEndDate(tournament.getEndDate());

            // Obtener el nombre del creador del torneo
            User creator = users.stream()
                    .filter(user -> user.getId().equals(tournament.getCreatorId()))
                    .findFirst()
                    .orElse(null);
            response.setCreatorUserName(creator != null ? creator.getUsername() : "Unknown");

            // Mapear la categoría del torneo
            Category category = categoryList.stream()
                    .filter(cat -> cat.getId().equals(tournament.getCategoryId()))
                    .findFirst()
                    .orElse(null);
            response.setCategory(category != null ? INSTANCE_CATEGORY.toDto(category) : null);

            // Mapear el tipo de juego del torneo
            GameType gameType = gameTypeList.stream()
                    .filter(gt -> gt.getId().equals(tournament.getGameTypeId()))
                    .findFirst()
                    .orElse(null);
            response.setGameType(gameType != null ? INSTANCE_GAME_TYPE.toDto(gameType) : null);

            // Obtener los moderadores del torneo y convertirlos a UserDto
            List<UserDto> moderators = tournamentModeratorList.stream()
                    .filter(moderator -> moderator.getTournamentId().equals(tournament.getId()))
                    .map(moderator -> {
                        User user = users.stream()
                                .filter(u -> u.getId().equals(moderator.getUserId()))
                                .findFirst()
                                .orElse(null);
                        return user != null ? INSTANCE_USER.toDto(user) : null;
                    })
                    .filter(Objects::nonNull) // Filtrar valores nulos
                    .collect(Collectors.toList());

            response.setLstModerators(moderators);

            return response;
        }).collect(Collectors.toList());
    }
}
