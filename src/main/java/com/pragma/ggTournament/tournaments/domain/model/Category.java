package com.pragma.ggTournament.tournaments.domain.model;

public class Category {
    private Long id;
    private String description;
    private String alias;

    public Category(Long id, String description, String alias) {
        this.id = id;
        this.description = description;
        this.alias = alias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
