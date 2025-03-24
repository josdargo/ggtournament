package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.User;

import java.util.List;

public interface IUserServicePort {
    Long createUser(User user);
    void updateUser(User user);
    List<User> getAll();
    User getById(Long id);
    User getByUsername(String username);
    List<User> getListByIds(List<Long> userIds);
}
