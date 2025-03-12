package com.pragma.ggTournament.tournaments.domain.model;

public class MatchTeams {
    private Long id;
    private Long matchId;
    private Long teamId;
    private String comment;

    public MatchTeams(Long id, Long matchId, Long teamId, String comment) {
        this.id = id;
        this.matchId = matchId;
        this.teamId = teamId;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
