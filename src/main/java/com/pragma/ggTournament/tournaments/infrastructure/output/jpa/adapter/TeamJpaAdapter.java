package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.Team;
import com.pragma.ggTournament.tournaments.domain.spi.ITeamPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.ITeamMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.ITeamRepository;
import com.pragma.ggTournament.tournaments.infrastructure.output.s3.AwsS3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
public class TeamJpaAdapter implements ITeamPersistencePort {
    private final ITeamRepository repository;
    private final ITeamMapper mapper;
    private final AwsS3Service awsS3Service;

    @Override
    public Long createTeam(Team team, MultipartFile imageFile) {
        String imageKey = awsS3Service.putObject(imageFile);
        team.setLogoUrl(awsS3Service.getUrlImage(imageKey));
        return repository.save(mapper.toEntity(team)).getId();
    }

    @Override
    public void updateTeam(Team team) {
        repository.save(mapper.toEntity(team));
    }

    @Override
    public List<Team> getByCreatorId(Long creatorId) {
        return mapper.toListTeam(repository.findByCreatorId(creatorId).orElseThrow(() -> new RuntimeException("Error")));
    }

    @Override
    public List<Team> getAll() {
        return mapper.toListTeam(repository.findAll());
    }

    @Override
    public Team getById(Long id) {
        return mapper.toTeam(repository.findById(id).orElseThrow(()->new RuntimeException("Error")));
    }

    @Override
    public List<Team> getListByIds(List<Long> teamIds) {
        return mapper.toListTeam(repository.findAllById(teamIds));
    }
}
