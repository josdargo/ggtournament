package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentModeratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ITournamentModeratorRepository extends JpaRepository<TournamentModeratorEntity, Long> {
    Optional<List<TournamentModeratorEntity>> findByTournamentId(Long tournamentId);
}
