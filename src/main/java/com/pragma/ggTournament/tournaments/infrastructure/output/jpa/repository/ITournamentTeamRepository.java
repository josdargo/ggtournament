package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.TournamentTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ITournamentTeamRepository extends JpaRepository<TournamentTeamEntity, Long> {
    Optional<List<TournamentTeamEntity>> findByTournamentId(Long tournamentIds);

}
