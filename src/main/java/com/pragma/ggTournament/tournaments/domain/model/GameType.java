package com.pragma.ggTournament.tournaments.domain.model;

public class GameType {
    private Long id;
    private String name;
    private Integer maxTeams;

    public GameType(Long id, String name, Integer maxTeams) {
        this.id = id;
        this.name = name;
        this.maxTeams = maxTeams;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxTeams() {
        return maxTeams;
    }

    public void setMaxTeams(Integer maxTeams) {
        this.maxTeams = maxTeams;
    }
}
