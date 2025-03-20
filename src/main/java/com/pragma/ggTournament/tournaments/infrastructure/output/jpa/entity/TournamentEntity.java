package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tournament")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TournamentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "creator_id", nullable = false)
    private Long creatorId;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String category;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
    @Column(name = "max_teams", nullable = false)
    private int maxTeams;
    @Column(nullable = false)
    private String mode;
    @Column(nullable = false)
    private String type;
    @Column(name = "rules_url", nullable = false)
    private String rulesUrl;
    @Column(name = "tournament_state", nullable = false)
    private String tournamentState;
}
