package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.TournamentModeratorRequest;
import com.pragma.ggTournament.tournaments.application.dto.TournamentRequest;
import com.pragma.ggTournament.tournaments.application.dto.TournamentTeamRequest;
import com.pragma.ggTournament.tournaments.application.mapper.ITournamentModeratorRequestMapper;
import com.pragma.ggTournament.tournaments.application.mapper.ITournamentRequestMapper;
import com.pragma.ggTournament.tournaments.application.mapper.ITournamentTeamRequestMapper;
import com.pragma.ggTournament.tournaments.domain.api.ITournamentModeratorServicePort;
import com.pragma.ggTournament.tournaments.domain.api.ITournamentServicePort;
import com.pragma.ggTournament.tournaments.domain.api.ITournamentTeamServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TournamentHandlerImpl implements ITournamentHandler{

    private final ITournamentServicePort tournamentServicePort;
    private final ITournamentTeamServicePort teamServicePort;
    private final ITournamentModeratorServicePort moderatorServicePort;
    private final ITournamentRequestMapper tournamentRequestMapper;
    private final ITournamentTeamRequestMapper teamRequestMapper;
    private final ITournamentModeratorRequestMapper moderatorRequestMapper;

    @Override
    public Long createTournament(TournamentRequest request) {
        return tournamentServicePort.createTournament(tournamentRequestMapper.toTournament(request));
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
}
