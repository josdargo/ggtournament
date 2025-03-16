package com.pragma.ggTournament.tournaments.domain.model;

public class TournamentTeam {
    private Long id;
    private Long tournamentId;
    private Long teamId;
    private Long idStatus;

    public TournamentTeam(Long id, Long tournamentId, Long teamId, Long idStatus) {
        this.id = id;
        this.tournamentId = tournamentId;
        this.teamId = teamId;
        this.idStatus = idStatus;
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

    public Long getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Long idStatus) {
        this.idStatus = idStatus;
    }
}
