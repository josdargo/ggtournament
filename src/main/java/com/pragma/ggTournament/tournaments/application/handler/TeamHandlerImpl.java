package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.TeamRequest;
import com.pragma.ggTournament.tournaments.application.dto.TeamResponse;
import com.pragma.ggTournament.tournaments.application.dto.TeamUserRequest;
import com.pragma.ggTournament.tournaments.application.mapper.ITeamRequestMapper;
import com.pragma.ggTournament.tournaments.application.mapper.ITeamResponseMapper;
import com.pragma.ggTournament.tournaments.application.mapper.ITeamUserRequestMapper;
import com.pragma.ggTournament.tournaments.domain.api.ITeamServicePort;
import com.pragma.ggTournament.tournaments.domain.api.ITeamUserServicePort;
import com.pragma.ggTournament.tournaments.domain.api.ITournamentTeamServicePort;
import com.pragma.ggTournament.tournaments.domain.api.IUserServicePort;
import com.pragma.ggTournament.tournaments.domain.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamHandlerImpl implements ITeamHandler{

    private final ITeamServicePort teamServicePort;
    private final ITeamUserServicePort teamUserServicePort;
    private final ITournamentTeamServicePort tournamentTeamServicePort;
    private final IUserServicePort userServicePort;

    private final ITeamRequestMapper teamRequestMapper;
    private final ITeamUserRequestMapper teamUserRequestMapper;
    private final ITeamResponseMapper teamResponseMapper;

    @Override
    public Long createTeam(TeamRequest request) {
        return teamServicePort.createTeam(teamRequestMapper.toTeam(request),request.getLogoFile());
    }

    @Override
    public void updateTeam(Team request) {
        teamServicePort.updateTeam(request);
    }

    @Override
    public void addUserToTeam(TeamUserRequest request) {
        teamUserServicePort.createTeamUser(teamUserRequestMapper.toTeamUser(request));
    }

    @Override
    public List<Team> getListTeam() {
        return teamServicePort.getAll();
    }

    @Override
    public Team getById(Long id) {
        return teamServicePort.getById(id);
    }

    @Override
    public List<Team> getListTeamByCreatorId(Long creatorId) {
        return teamServicePort.getByCreatorId(creatorId);
    }

    @Override
    public List<TeamResponse> getListTeamByTournamentId(Long tournamentId) {
        List<TournamentTeam> listTournamentTeam = tournamentTeamServicePort.getListTeamByTournamentId(tournamentId);
        if (listTournamentTeam.isEmpty()) {
            return Collections.emptyList();
        }

        Set<Long> teamIds = listTournamentTeam.stream()
                        .map(TournamentTeam::getTeamId)
                        .collect(Collectors.toSet());

        List<Team> teamList = teamServicePort.getListByIds(new ArrayList<>(teamIds));
        if (teamList.isEmpty()) {
            return Collections.emptyList();
        }

        List<TeamUser> teamUserList = teamUserServicePort.getListByTeamIds(new ArrayList<>(teamIds));

        Set<Long> userIds = teamUserList
                        .stream()
                        .map(TeamUser::getUserId)
                        .collect(Collectors.toSet());
        List<User> userList = userIds.isEmpty() ? Collections.emptyList() : userServicePort.getListByIds(new ArrayList<>(userIds));

        return  teamResponseMapper.toListTeamResponse(teamList,teamUserList,userList);
    }
}
