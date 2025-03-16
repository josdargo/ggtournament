package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Team;

import java.util.List;

public interface ITeamServicePort {
    Long createTeam(Team team);
    void updateTeam(Team team);
    List<Team> findByCreatorId(Long creatorId);
    List<Team> findAll();
}
