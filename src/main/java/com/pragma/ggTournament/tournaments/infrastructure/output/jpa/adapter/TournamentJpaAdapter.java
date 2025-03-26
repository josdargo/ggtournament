package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.Tournament;
import com.pragma.ggTournament.tournaments.domain.spi.ITournamentPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.ITournamentMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.ITournamentRepository;
import com.pragma.ggTournament.tournaments.infrastructure.output.s3.AwsS3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
public class TournamentJpaAdapter implements ITournamentPersistencePort {

    private final ITournamentRepository repository;
    private final ITournamentMapper mapper;
    private final AwsS3Service awsS3Service;

    @Override
    public Long createTournament(Tournament tournament, MultipartFile file) {
        String fileKey = awsS3Service.putObject(file);
        tournament.setRulesUrl(awsS3Service.getUrlImage(fileKey));
        return repository.save(mapper.toEntity(tournament)).getId();
    }

    @Override
    public void updateTournament(Tournament tournament) {
        repository.save(mapper.toEntity(tournament));
    }

    @Override
    public List<Tournament> getListTournamentByCreatorId(Long creatorId) {
        return mapper.toListTournament(repository.findByCreatorId(creatorId).orElseThrow());
    }

    @Override
    public Tournament getById(Long id) {
        return mapper.toTournament(repository.findById(id).orElseThrow());
    }

    @Override
    public List<Tournament> getListTournamentByState(String tournamentState) {
        return mapper.toListTournament(repository.findByTournamentState(tournamentState).orElseThrow());
    }
}
