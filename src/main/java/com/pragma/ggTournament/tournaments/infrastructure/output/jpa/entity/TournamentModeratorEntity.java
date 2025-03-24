package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tournament_moderator")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TournamentModeratorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tournament_id", nullable = false)
    private Long tournamentId;
    @Column(name = "user_id", nullable = false)
    private Long userId;
}
