package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TeamUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ITeamUserRepository extends JpaRepository<TeamUserEntity, Long> {

    Optional<List<TeamUserEntity>> findByUserId(Long userId);
    Optional<List<TeamUserEntity>> findByTeamId(Long teamId);
    Optional<List<TeamUserEntity>> findByRole(String role);
    Optional<List<TeamUserEntity>> findByTeamIdIn(List<Long> teamIds);

}
