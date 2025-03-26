package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IMatchRepository extends JpaRepository<MatchEntity, Long> {
    Optional<List<MatchEntity>> findByTournamentId(Long tournamentId);
}
