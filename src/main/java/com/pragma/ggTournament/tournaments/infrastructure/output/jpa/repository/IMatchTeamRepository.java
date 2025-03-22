package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.MatchTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMatchTeamRepository extends JpaRepository<MatchTeamEntity, Long> {
    List<MatchTeamEntity> findByMatchId(Long matchId);
    List<MatchTeamEntity> findByTeamId(Long teamId);
}
