package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Team;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ITeamServicePort {
    Long createTeam(Team team, MultipartFile imageFile);
    void updateTeam(Team team);
    List<Team> getByCreatorId(Long creatorId);
    List<Team> getAll();
    Team getById(Long id);

    List<Team> getListByIds(List<Long> teamIds);
}
