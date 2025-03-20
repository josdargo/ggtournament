package com.pragma.ggTournament.tournaments.domain.model;

import java.time.LocalDateTime;

public class Tournament {
    private Long id;
    private Long creatorId;
    private String title;
    private String description;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime updatedAt;
    private int maxTeams;
    private String mode;
    private String type;
    private String rulesUrl;
    private String tournamentState;

    public Tournament(Long id, Long creatorId, String title, String description, String category, LocalDateTime createdAt, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime updatedAt, int maxTeams, String mode, String type, String rulesUrl, String tournamentState) {
        this.id = id;
        this.creatorId = creatorId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.createdAt = createdAt;
        this.startDate = startDate;
        this.endDate = endDate;
        this.updatedAt = updatedAt;
        this.maxTeams = maxTeams;
        this.mode = mode;
        this.type = type;
        this.rulesUrl = rulesUrl;
        this.tournamentState = tournamentState;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getMaxTeams() {
        return maxTeams;
    }

    public void setMaxTeams(int maxTeams) {
        this.maxTeams = maxTeams;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRulesUrl() {
        return rulesUrl;
    }

    public void setRulesUrl(String rulesUrl) {
        this.rulesUrl = rulesUrl;
    }

    public String getTournamentState() {
        return tournamentState;
    }

    public void setTournamentState(String tournamentState) {
        this.tournamentState = tournamentState;
    }
}
