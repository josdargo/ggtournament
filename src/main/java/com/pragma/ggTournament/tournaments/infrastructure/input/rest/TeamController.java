package com.pragma.ggTournament.tournaments.infrastructure.input.rest;

import com.pragma.ggTournament.tournaments.application.dto.TeamRequest;
import com.pragma.ggTournament.tournaments.application.dto.TeamResponse;
import com.pragma.ggTournament.tournaments.application.dto.TeamUserRequest;
import com.pragma.ggTournament.tournaments.application.handler.ITeamHandler;
import com.pragma.ggTournament.tournaments.domain.model.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
public class TeamController {
    private final ITeamHandler teamHandler;

    @PostMapping("/")
    public ResponseEntity<Long> createTeam(@RequestBody TeamRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(teamHandler.createTeam(request));
    }

    @PutMapping("/")
    public ResponseEntity<Void> updateTeam(@RequestBody Team request) {
        teamHandler.updateTeam(request);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/add-user")
    public ResponseEntity<Void> addUserToTeam(@RequestBody TeamUserRequest request) {
        teamHandler.addUserToTeam(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<Team>> getListTeam() {
        return ResponseEntity.ok(teamHandler.getListTeam());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Team> getById(@PathVariable Long id) {
        return ResponseEntity.ok(teamHandler.getById(id));
    }

    @GetMapping("/creator/{creatorId}")
    public ResponseEntity<List<Team>> getListTeamByCreatorId(@PathVariable Long creatorId) {
        return ResponseEntity.ok(teamHandler.getListTeamByCreatorId(creatorId));
    }

    @GetMapping("/tournament/{tournamentId}")
    public ResponseEntity<List<TeamResponse>> getListTeamByTournamentId(@PathVariable Long tournamentId) {
        return ResponseEntity.ok(teamHandler.getListTeamByTournamentId(tournamentId));
    }
}

