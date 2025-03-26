package com.pragma.ggTournament.tournaments.domain.usecase;

import com.pragma.ggTournament.tournaments.domain.api.IUserServicePort;
import com.pragma.ggTournament.tournaments.domain.model.User;
import com.pragma.ggTournament.tournaments.domain.spi.IUserPersistencePort;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort){
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public Long createUser(User user, MultipartFile imageFile) {
        return userPersistencePort.createUser(user,imageFile);
    }

    @Override
    public void updateUser(User user) {
        userPersistencePort.updateUser(user);
    }

    @Override
    public List<User> getAll() {
        return userPersistencePort.getAll();
    }

    @Override
    public User getById(Long id) {
        return userPersistencePort.getById(id);
    }

    @Override
    public User getByUsername(String username) {
        return userPersistencePort.getByUsername(username);
    }

    @Override
    public List<User> getListByIds(List<Long> userIds) {
        return userPersistencePort.getListByIds(userIds);
    }
}
