package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.TeamUser;

import java.util.List;

public interface ITeamUserPersistencePort {
    Long createTeamUser(TeamUser teamUser);
    List<TeamUser> findByUserId(Long userId);
    List<TeamUser> findByTeamId(Long teamId);
    List<TeamUser> findByRole(String role);
}
