package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.User;

import java.util.List;

public interface IUserServicePort {
    Long createUser(User user);
    void updateUser(User user);
    List<User> findAll();
    User findById(Long id);
    User findByUsername(String username);
}
