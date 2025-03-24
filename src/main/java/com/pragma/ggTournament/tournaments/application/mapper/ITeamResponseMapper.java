package com.pragma.ggTournament.tournaments.application.mapper;

import com.pragma.ggTournament.tournaments.application.dto.TeamResponse;
import com.pragma.ggTournament.tournaments.application.dto.UserDto;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.domain.model.TeamUser;
import com.pragma.ggTournament.tournaments.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ITeamResponseMapper {

    IUserDtoMapper INSTANCE_USER = Mappers.getMapper(IUserDtoMapper.class);

    default List<TeamResponse> toListTeamResponse(List<Team> teamList, List<TeamUser> teamUserList, List<User> userList) {
        return teamList.stream().map(team -> {
            TeamResponse teamResponse = new TeamResponse();
            teamResponse.setName(team.getName());
            teamResponse.setDescription(team.getDescription());
            teamResponse.setLogoUrl(team.getLogoUrl());

            // Obtener el creador del equipo
            User creator = userList.stream()
                    .filter(user -> user.getId().equals(team.getCreatorId()))
                    .findFirst()
                    .orElse(null);

            teamResponse.setCreatorUsername(creator != null ? creator.getUsername() : "Unknown");

            // Obtener los miembros del equipo con su rol en UserDto
            List<UserDto> teamMembers = teamUserList.stream()
                    .filter(teamUser -> teamUser.getTeamId().equals(team.getId()))
                    .map(teamUser -> {
                        User user = userList.stream()
                                .filter(u -> u.getId().equals(teamUser.getUserId()))
                                .findFirst()
                                .orElse(null);
                        if (user != null) {
                            UserDto userDto = INSTANCE_USER.toDto(user);
                            userDto.setRole(teamUser.getRole());
                            return userDto;
                        }
                        return null;
                    })
                    .filter(Objects::nonNull) // Filtra los valores nulos
                    .collect(Collectors.toList());

            teamResponse.setMembers(teamMembers);
            return teamResponse;
        }).collect(Collectors.toList());
    }
}
