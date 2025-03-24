package com.pragma.ggTournament.tournaments.infrastructure.input.rest;

import com.pragma.ggTournament.tournaments.application.dto.MatchRequest;
import com.pragma.ggTournament.tournaments.application.dto.MatchResponse;
import com.pragma.ggTournament.tournaments.application.dto.MatchTeamDto;
import com.pragma.ggTournament.tournaments.application.handler.IMatchHandler;
import com.pragma.ggTournament.tournaments.domain.model.Match;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
@RequiredArgsConstructor
public class MatchController {
    private final IMatchHandler matchHandler;

    @PostMapping("/")
    public ResponseEntity<Long> saveMatch(@RequestBody MatchRequest matchRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(matchHandler.createMatch(matchRequest));
    }

    @PutMapping("/")
    public ResponseEntity<Void> updateMatch(@RequestBody Match match) {
        matchHandler.updateMatch(match);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/teams")
    public ResponseEntity<Void> addTeamToMatch(@RequestBody MatchTeamDto request) {
        matchHandler.addTeamToMatch(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{tournamentId}")
    public ResponseEntity<List<MatchResponse>> getMatchesByTournament(@PathVariable Long tournamentId) {
        return ResponseEntity.ok(matchHandler.getListMatchByTournamentId(tournamentId));
    }
}
