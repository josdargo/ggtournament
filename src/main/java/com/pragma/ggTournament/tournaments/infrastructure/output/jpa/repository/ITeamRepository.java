package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ITeamRepository extends JpaRepository<TeamEntity, Long> {
    Optional<List<TeamEntity>> findByCreatorId(Long creatorId);
}
