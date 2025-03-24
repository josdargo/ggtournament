package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tournament_team")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TournamentTeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tournament_id", nullable = false)
    private Long tournamentId;
    @Column(name = "team_id", nullable = false)
    private Long teamId;
    @Column(name = "team_state", nullable = false)
    private String teamState;;
}
