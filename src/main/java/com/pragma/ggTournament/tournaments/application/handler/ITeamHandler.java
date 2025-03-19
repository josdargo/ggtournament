package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.TeamRequest;
import com.pragma.ggTournament.tournaments.application.dto.TeamUserRequest;
import com.pragma.ggTournament.tournaments.domain.model.Team;

public interface ITeamHandler {
    Long createTeam(TeamRequest request);
    void updateTeam(Team request);
    void addUserToTeam(TeamUserRequest request);
}
