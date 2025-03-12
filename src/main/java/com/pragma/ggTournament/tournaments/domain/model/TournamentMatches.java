package com.pragma.ggTournament.tournaments.domain.model;

public class TournamentMatches {
    private Long id;
    private Long tournamentId;
    private Long matchId;
    private Character groupStageName;

    public TournamentMatches(Long id, Long tournamentId, Long matchId, Character groupStageName) {
        this.id = id;
        this.tournamentId = tournamentId;
        this.matchId = matchId;
        this.groupStageName = groupStageName;
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

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Character getGroupStageName() {
        return groupStageName;
    }

    public void setGroupStageName(Character groupStageName) {
        this.groupStageName = groupStageName;
    }
}
