package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.UserRequest;
import com.pragma.ggTournament.tournaments.domain.model.User;

public interface IAdminHandler {
    Long createUser(UserRequest request);
    void updateUser(User request);
}
