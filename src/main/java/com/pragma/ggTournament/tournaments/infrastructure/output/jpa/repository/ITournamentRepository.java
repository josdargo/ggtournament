package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITournamentRepository extends JpaRepository<TournamentEntity,Long> {
}
