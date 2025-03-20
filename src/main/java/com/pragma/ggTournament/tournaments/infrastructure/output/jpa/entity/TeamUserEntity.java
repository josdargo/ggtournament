package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "team_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "team_id", nullable = false)
    private Long teamId;
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Column(nullable = false)
    private String role;
}
