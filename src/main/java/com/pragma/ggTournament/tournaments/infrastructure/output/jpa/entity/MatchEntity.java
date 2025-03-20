package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "match")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tournament_id", nullable = false)
    private Long tournamentId;
    @Column(nullable = false)
    private String stage;
    @Column(name = "match_state", nullable = false)
    private String matchState;
    @Column(name = "match_date", nullable = false)
    private LocalDateTime matchDate;
    @Column(name = "winner_team_id", nullable = false)
    private Long winnerTeamId;
    @Column(name = "group_stage_name", nullable = false)
    private Character groupStageName;
}
