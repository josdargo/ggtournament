package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.GameTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGameTypeRepository extends JpaRepository<GameTypeEntity, Long> {
}
