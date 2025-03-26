package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "match_team")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MatchTeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "match_id", nullable = false)
    private Long matchId;
    @Column(name = "team_id", nullable = false)
    private Long teamId;
    @Column( nullable = false, length = 500)
    private String comment;
}
