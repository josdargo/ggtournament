package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper;

import com.pragma.ggTournament.tournaments.domain.model.User;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {
    UserEntity toEntity(User user);
    User toUser(UserEntity user);
    List<User> toListUser(List<UserEntity> userEntityList);
}
