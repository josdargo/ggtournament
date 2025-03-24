package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.TeamRequest;
import com.pragma.ggTournament.tournaments.application.dto.TeamResponse;
import com.pragma.ggTournament.tournaments.application.dto.TeamUserRequest;
import com.pragma.ggTournament.tournaments.domain.model.Team;

import java.util.List;

public interface ITeamHandler {
    Long createTeam(TeamRequest request);
    void updateTeam(Team request);
    void addUserToTeam(TeamUserRequest request);
    List<Team> getListTeam();
    Team getById(Long id);
    List<Team> getListTeamByCreatorId(Long creatorId);
    List<TeamResponse> getListTeamByTournamentId(Long tournamentId);

}
