package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.TournamentModeratorRequest;
import com.pragma.ggTournament.tournaments.application.dto.TournamentRequest;
import com.pragma.ggTournament.tournaments.application.dto.TournamentResponse;
import com.pragma.ggTournament.tournaments.application.dto.TournamentTeamRequest;
import com.pragma.ggTournament.tournaments.application.mapper.ITournamentModeratorRequestMapper;
import com.pragma.ggTournament.tournaments.application.mapper.ITournamentRequestMapper;
import com.pragma.ggTournament.tournaments.application.mapper.ITournamentResponseMapper;
import com.pragma.ggTournament.tournaments.application.mapper.ITournamentTeamRequestMapper;
import com.pragma.ggTournament.tournaments.domain.api.*;
import com.pragma.ggTournament.tournaments.domain.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TournamentHandlerImpl implements ITournamentHandler{

    private final ITournamentServicePort tournamentServicePort;
    private final ITournamentTeamServicePort teamServicePort;
    private final ITournamentModeratorServicePort moderatorServicePort;
    private final ICategoryServicePort categoryServicePort;
    private final IGameTypeServicePort gameTypeServicePort;
    private final IUserServicePort userServicePort;

    private final ITournamentRequestMapper tournamentRequestMapper;
    private final ITournamentTeamRequestMapper teamRequestMapper;
    private final ITournamentModeratorRequestMapper moderatorRequestMapper;
    private final ITournamentResponseMapper tournamentResponseMapper;

    @Override
    public Long createTournament(TournamentRequest request) {
        return tournamentServicePort.createTournament(tournamentRequestMapper.toTournament(request), request.getRulesFile());
    }

    @Override
    public void updateTournament(Tournament request) {
        tournamentServicePort.updateTournament(request);
    }

    @Override
    public void addTeamToTournament(TournamentTeamRequest request) {
        teamServicePort.createTournamentTeam(teamRequestMapper.toTournamentTeam(request));
    }

    @Override
    public void addModeratorsToTournament(TournamentModeratorRequest request) {
        moderatorServicePort.createTournamentModerator(moderatorRequestMapper.toTournamentModerator(request));
    }

    @Override
    public List<TournamentResponse> getListTournamentResponseByState(String tournamentState) {

        List<Tournament> tournamentList = tournamentServicePort.getListTournamentByState(tournamentState);

        List<Category> categoryList = categoryServicePort.getListCategory();

        List<GameType> gameTypeList = gameTypeServicePort.getListGameType();

        Set<Long> tournamentIds = tournamentList.stream()
                .map(Tournament::getId)
                .collect(Collectors.toSet());
        List<TournamentModerator> tournamentModeratorList = moderatorServicePort.getListByTournamentIds(new ArrayList<>(tournamentIds));

        Set<Long> creatorIds = tournamentList.stream()
                .map(Tournament::getCreatorId)
                .collect(Collectors.toSet());
        List<User> userList = userServicePort.getListByIds(new ArrayList<>(creatorIds));


        return tournamentResponseMapper.toListTournamentResponse(tournamentList, categoryList,gameTypeList,tournamentModeratorList,userList);
    }

    @Override
    public Tournament getTournamentById(Long id) {
        return tournamentServicePort.getById(id);
    }

    @Override
    public TournamentResponse getTournamentResponseById(Long id) {
        return null;
    }
}
