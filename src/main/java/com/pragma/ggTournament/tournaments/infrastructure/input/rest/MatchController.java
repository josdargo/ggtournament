package com.pragma.ggTournament.tournaments.infrastructure.input.rest;

import com.pragma.ggTournament.tournaments.application.dto.MatchRequest;
import com.pragma.ggTournament.tournaments.application.handler.IMatchHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
@RequiredArgsConstructor
public class MatchController {
    private final IMatchHandler matchHandler;

    @PostMapping("/")
    public ResponseEntity<Long> saveMatch(@RequestBody MatchRequest matchRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(matchHandler.createMatch(matchRequest));
    }
}
