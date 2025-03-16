package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {
    Long createUser(User user);
    void updateUser(User user);
    List<User> findAll();
    User findById(Long id);
    User findByUsername(String username);
}
