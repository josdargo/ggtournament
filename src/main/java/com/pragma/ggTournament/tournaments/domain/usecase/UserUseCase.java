package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.IUserServicePort;
import com.pragma.ggTournament.tournaments.domain.model.User;
import com.pragma.ggTournament.tournaments.domain.spi.IUserPersistencePort;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort){
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public Long createUser(User user) {
        return userPersistencePort.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userPersistencePort.updateUser(user);
    }

    @Override
    public List<User> findAll() {
        return userPersistencePort.findAll();
    }

    @Override
    public User findById(Long id) {
        return userPersistencePort.findById(id);
    }
}
