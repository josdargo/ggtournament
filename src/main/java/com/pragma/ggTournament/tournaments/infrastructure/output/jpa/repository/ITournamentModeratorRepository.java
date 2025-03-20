package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentModeratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITournamentModeratorRepository extends JpaRepository<TournamentModeratorEntity, Long> {
}
