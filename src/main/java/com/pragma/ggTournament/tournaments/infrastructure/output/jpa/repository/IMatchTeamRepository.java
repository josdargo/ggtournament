package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.MatchTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatchTeamRepository extends JpaRepository<MatchTeamEntity, Long> {
}
