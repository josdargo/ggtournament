package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITournamentTeamRepository extends JpaRepository<TournamentTeamEntity, Long> {
}
