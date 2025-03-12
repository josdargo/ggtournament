package com.pragma.ggTournament.tournaments.domain.model;

public class State {
    private Long id;
    private String state;
    private String description;

    public State(Long id, String state, String description) {
        this.id = id;
        this.state = state;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
