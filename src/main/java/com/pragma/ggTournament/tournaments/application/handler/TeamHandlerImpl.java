package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.TeamRequest;
import com.pragma.ggTournament.tournaments.application.dto.TeamUserRequest;
import com.pragma.ggTournament.tournaments.application.mapper.ITeamRequestMapper;
import com.pragma.ggTournament.tournaments.application.mapper.ITeamUserRequestMapper;
import com.pragma.ggTournament.tournaments.domain.api.ITeamServicePort;
import com.pragma.ggTournament.tournaments.domain.api.ITeamUserServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeamHandlerImpl implements ITeamHandler{

    private final ITeamServicePort teamServicePort;
    private final ITeamUserServicePort teamUserServicePort;
    private final ITeamRequestMapper teamRequestMapper;
    private final ITeamUserRequestMapper teamUserRequestMapper;

    @Override
    public Long createTeam(TeamRequest request) {
        return teamServicePort.createTeam(teamRequestMapper.toTeam(request));
    }

    @Override
    public void updateTeam(Team request) {
        teamServicePort.updateTeam(request);
    }

    @Override
    public void addUserToTeam(TeamUserRequest request) {
        teamUserServicePort.createTeamUser(teamUserRequestMapper.toTeamUser(request));
    }
}
