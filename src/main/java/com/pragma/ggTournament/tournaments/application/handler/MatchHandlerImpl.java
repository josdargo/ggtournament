package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.MatchRequest;
import com.pragma.ggTournament.tournaments.application.dto.MatchResponse;
import com.pragma.ggTournament.tournaments.application.dto.MatchTeamDto;
import com.pragma.ggTournament.tournaments.application.mapper.IMatchRequestMapper;
import com.pragma.ggTournament.tournaments.application.mapper.IMatchResponseMapper;
import com.pragma.ggTournament.tournaments.application.mapper.IMatchTeamDtoMapper;
import com.pragma.ggTournament.tournaments.domain.api.IMatchServicePort;
import com.pragma.ggTournament.tournaments.domain.api.IMatchTeamServicePort;
import com.pragma.ggTournament.tournaments.domain.api.ITeamServicePort;
import com.pragma.ggTournament.tournaments.domain.api.ITournamentServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Match;
import com.pragma.ggTournament.tournaments.domain.model.MatchTeam;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MatchHandlerImpl implements IMatchHandler{

    private final IMatchServicePort matchServicePort;
    private final IMatchTeamServicePort matchTeamServicePort;
    private final ITournamentServicePort tournamentServicePort;
    private final ITeamServicePort teamServicePort;

    private final IMatchRequestMapper matchRequestMapper;
    private final IMatchTeamDtoMapper matchTeamDtoMapper;
    private final IMatchResponseMapper matchResponseMapper;

    @Override
    public Long createMatch(MatchRequest request) {
        return matchServicePort.createMatch(matchRequestMapper.toMatch(request));
    }

    @Override
    public void updateMatch(Match request) {
        matchServicePort.updateMatch(request);
    }

    @Override
    public void addTeamToMatch(MatchTeamDto request) {
        matchTeamServicePort.createMatchTeam(matchTeamDtoMapper.toMatchTeam(request));
    }

    @Override
    public List<MatchResponse> getListMatchByTournamentId(Long tournamentId) {
        Tournament tournament = tournamentServicePort.getById(tournamentId);
        List<Match> matchList = matchServicePort.getListByTournamentId(tournamentId);

        List<Long> matchIds = matchList.stream()
                .map(Match::getId)
                .collect(Collectors.toList());

        List<MatchTeam> matchTeamList = matchTeamServicePort.getListByMatchIds(matchIds);

        List<Long> teamIds = matchTeamList.stream()
                .map(MatchTeam::getTeamId)
                .distinct()
                .collect(Collectors.toList());

        List<Team> teamList = teamServicePort.getListByIds(teamIds);

        return matchResponseMapper.toListMatchResponse(matchList,tournament,matchTeamList,teamList);
    }

}
