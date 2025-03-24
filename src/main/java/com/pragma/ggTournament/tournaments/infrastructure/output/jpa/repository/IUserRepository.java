package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}
