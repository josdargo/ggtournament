package com.pragma.ggTournament.tournaments.domain.model;

import java.time.LocalDateTime;

public class Match {
    private Long id;
    private Long tournamentId;
    private String stage;
    private String matchState;
    private LocalDateTime matchDate;
    private Long winnerTeamId;

    public Match(Long id, Long tournamentId, String stage, String matchState, LocalDateTime matchDate, Long winnerTeamId) {
        this.id = id;
        this.tournamentId = tournamentId;
        this.stage = stage;
        this.matchState = matchState;
        this.matchDate = matchDate;
        this.winnerTeamId = winnerTeamId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getMatchState() {
        return matchState;
    }

    public void setMatchState(String matchState) {
        this.matchState = matchState;
    }

    public LocalDateTime getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDateTime matchDate) {
        this.matchDate = matchDate;
    }

    public Long getWinnerTeamId() {
        return winnerTeamId;
    }

    public void setWinnerTeamId(Long winnerTeamId) {
        this.winnerTeamId = winnerTeamId;
    }
}
