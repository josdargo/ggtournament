package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.TeamUser;

import java.util.List;

public interface ITeamUserServicePort {
    Long createTeamUser(TeamUser teamUser);
    List<TeamUser> getByUserId(Long userId);
    List<TeamUser> getByTeamId(Long teamId);
    List<TeamUser> getByRole(String role);
    List<TeamUser> getListByTeamIds(List<Long> teamIds);
}
