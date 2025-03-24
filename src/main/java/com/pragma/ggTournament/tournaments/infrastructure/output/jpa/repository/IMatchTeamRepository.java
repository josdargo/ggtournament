package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.MatchTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IMatchTeamRepository extends JpaRepository<MatchTeamEntity, Long> {
    Optional<List<MatchTeamEntity>> findByMatchId(Long matchId);
    Optional<List<MatchTeamEntity>> findByTeamId(Long teamId);
    Optional<List<MatchTeamEntity>> findByMatchIdIn(List<Long> matchIds);
}
