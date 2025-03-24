package com.pragma.ggTournament.tournaments.infrastructure.input.rest;

import com.pragma.ggTournament.tournaments.application.dto.TournamentModeratorRequest;
import com.pragma.ggTournament.tournaments.application.dto.TournamentRequest;
import com.pragma.ggTournament.tournaments.application.dto.TournamentResponse;
import com.pragma.ggTournament.tournaments.application.dto.TournamentTeamRequest;
import com.pragma.ggTournament.tournaments.application.handler.ITournamentHandler;
import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
@RequiredArgsConstructor
public class TournamentController {
    private final ITournamentHandler tournamentHandler;

    @PostMapping("/")
    public ResponseEntity<Long> createTournament(@RequestBody TournamentRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tournamentHandler.createTournament(request));
    }

    @PutMapping("/")
    public ResponseEntity<Void> updateTournament(@RequestBody Tournament request) {
        tournamentHandler.updateTournament(request);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/add-team")
    public ResponseEntity<Void> addTeamToTournament(@RequestBody TournamentTeamRequest request) {
        tournamentHandler.addTeamToTournament(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/add-moderators")
    public ResponseEntity<Void> addModeratorsToTournament(@RequestBody TournamentModeratorRequest request) {
        tournamentHandler.addModeratorsToTournament(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/state/{tournamentState}")
    public ResponseEntity<List<TournamentResponse>> getListTournamentResponseByState(@PathVariable String tournamentState) {
        return ResponseEntity.ok(tournamentHandler.getListTournamentResponseByState(tournamentState));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tournament> getTournamentById(@PathVariable Long id) {
        return ResponseEntity.ok(tournamentHandler.getTournamentById(id));
    }

    @GetMapping("/{id}/response")
    public ResponseEntity<TournamentResponse> getTournamentResponseById(@PathVariable Long id) {
        return ResponseEntity.ok(tournamentHandler.getTournamentResponseById(id));
    }
}

