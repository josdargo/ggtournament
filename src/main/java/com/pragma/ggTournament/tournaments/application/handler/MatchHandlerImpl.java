package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.MatchRequest;
import com.pragma.ggTournament.tournaments.application.dto.MatchTeamDto;
import com.pragma.ggTournament.tournaments.application.mapper.IMatchRequestMapper;
import com.pragma.ggTournament.tournaments.application.mapper.IMatchTeamDtoMapper;
import com.pragma.ggTournament.tournaments.domain.api.IMatchServicePort;
import com.pragma.ggTournament.tournaments.domain.api.IMatchTeamServicePort;
import com.pragma.ggTournament.tournaments.domain.model.Match;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchHandlerImpl implements IMatchHandler{

    private final IMatchServicePort matchServicePort;
    private final IMatchTeamServicePort matchTeamServicePort;
    private final IMatchRequestMapper matchRequestMapper;
    private final IMatchTeamDtoMapper matchTeamDtoMapper;

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
}
