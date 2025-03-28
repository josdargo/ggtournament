package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.User;
import com.pragma.ggTournament.tournaments.domain.spi.IUserPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.IUserMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.IUserRepository;
import com.pragma.ggTournament.tournaments.infrastructure.output.s3.AwsS3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository repository;
    private final IUserMapper mapper;
    private final AwsS3Service awsS3Service;

    @Override
    public Long createUser(User user, MultipartFile photoFile) {
        String imageKey = awsS3Service.putObject(photoFile);
        user.setProfilePhotoUrl(awsS3Service.getUrlImage(imageKey));
        return repository.save(mapper.toEntity(user)).getId();
    }

    @Override
    public void updateUser(User user) {
        repository.save(mapper.toEntity(user));
    }

    @Override
    public List<User> getAll() {
        return mapper.toListUser(repository.findAll());
    }

    @Override
    public User getById(Long id) {
        return mapper.toUser(repository.findById(id).orElseThrow());
    }

    @Override
    public User getByUsername(String username) {
        return mapper.toUser(repository.findByUsername(username).orElseThrow());
    }

    @Override
    public List<User> getListByIds(List<Long> userIds) {
        return mapper.toListUser(repository.findAllById(userIds));
    }
}
