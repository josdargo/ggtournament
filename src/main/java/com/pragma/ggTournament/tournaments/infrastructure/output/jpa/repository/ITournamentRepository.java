package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ITournamentRepository extends JpaRepository<TournamentEntity,Long> {
    Optional<List<TournamentEntity>> findByCreatorId(Long creatorId);
}
