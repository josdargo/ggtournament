package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Team;

import java.util.List;

public interface ITeamServicePort {
    Long createTeam(Team team);
    void updateTeam(Team team);
    List<Team> getByCreatorId(Long creatorId);
    List<Team> getAll();
    Team getById(Long id);

    List<Team> getListByIds(List<Long> teamIds);
}
