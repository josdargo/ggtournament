package com.pragma.ggTournament.tournaments.domain.model;

public class TournamentTeams {
    private Long id;
    private Long tournamentId;
    private Long teamId;

    public TournamentTeams(Long id, Long tournamentId, Long teamId) {
        this.id = id;
        this.tournamentId = tournamentId;
        this.teamId = teamId;
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

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}
