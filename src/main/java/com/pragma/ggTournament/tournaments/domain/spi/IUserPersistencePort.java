package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IUserPersistencePort {
    Long createUser(User user, MultipartFile imageFile);
    void updateUser(User user);
    List<User> getAll();
    User getById(Long id);
    User getByUsername(String username);
    List<User> getListByIds(List<Long> userIds);
}
