package com.pragma.ggTournament.tournaments.domain.model;

public class TournamentModerator {
    private Long id;
    private Long tournamentId;
    private Long userId;

    public TournamentModerator(Long id, Long tournamentId, Long userId) {
        this.id = id;
        this.tournamentId = tournamentId;
        this.userId = userId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
