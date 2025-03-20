package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TeamUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamUserRepository extends JpaRepository<TeamUserEntity, Long> {
}
