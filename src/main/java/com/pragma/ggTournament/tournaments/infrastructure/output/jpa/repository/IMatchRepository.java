package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatchRepository extends JpaRepository<MatchEntity, Long> {
}
