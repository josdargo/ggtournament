package com.pragma.ggTournament.tournaments.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class TeamResponse {
    private String name;
    private String description;
    private String creatorUsername;
    private String logoUrl;
    private List<UserDto> members;
}
