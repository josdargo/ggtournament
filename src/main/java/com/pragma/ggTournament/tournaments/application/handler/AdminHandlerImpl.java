package com.pragma.ggTournament.tournaments.application.handler;

import com.pragma.ggTournament.tournaments.application.dto.UserRequest;
import com.pragma.ggTournament.tournaments.application.mapper.IUserRequestMapper;
import com.pragma.ggTournament.tournaments.domain.api.IUserServicePort;
import com.pragma.ggTournament.tournaments.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminHandlerImpl implements IAdminHandler{

    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;

    @Override
    public Long createUser(UserRequest request) {
        return userServicePort.createUser(userRequestMapper.toUser(request));
    }

    @Override
    public void updateUser(User request) {
        userServicePort.updateUser(request);
    }
}
