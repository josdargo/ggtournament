package com.pragma.ggTournament.tournaments.infrastructure.configuration;

import com.pragma.ggTournament.tournaments.domain.api.*;
import com.pragma.ggTournament.tournaments.domain.spi.*;
import com.pragma.ggTournament.tournaments.domain.usecase.*;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter.*;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.*;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IMatchRepository matchRepository;
    private final IMatchMapper matchMapper;
    private final IMatchTeamMapper matchTeamMapper;
    private final IMatchTeamRepository matchTeamRepository;
    private final ITeamRepository teamRepository;
    private final ITeamMapper teamMapper;
    private final ITeamUserRepository teamUserRepository;
    private final ITeamUserMapper teamUserMapper;
    private final ITournamentRepository tournamentRepository;
    private final ITournamentMapper tournamentMapper;
    private final ITournamentModeratorRepository tournamentModeratorRepository;
    private final ITournamentModeratorMapper tournamentModeratorMapper;
    private final ITournamentTeamRepository tournamentTeamRepository;
    private final ITournamentTeamMapper tournamentTeamMapper;
    private final IUserRepository userRepository;
    private final IUserMapper userMapper;
    private final ICategoryRepository categoryRepository;
    private final ICategoryEntityMapper categoryMapper;
    private final IGameTypeRepository gameTypeRepository;
    private final IGameTypeEntityMapper gameTypeMapper;

    @Bean
    public IMatchPersistencePort matchPersistencePort(){
        return new MatchJpaAdapter(matchRepository,matchMapper);
    }
    @Bean
    public IMatchServicePort matchServicePort(){
        return new MatchUseCase(matchPersistencePort());
    }

    @Bean
    public IMatchTeamPersistencePort matchTeamPersistencePort(){
        return new MatchTeamJpaAdapter(matchTeamRepository,matchTeamMapper);
    }
    @Bean
    public IMatchTeamServicePort matchTeamServicePort(){
        return new MatchTeamUseCase(matchTeamPersistencePort());
    }

    @Bean
    public ITeamPersistencePort teamPersistencePort(){
        return new TeamJpaAdapter(teamRepository,teamMapper);
    }
    @Bean
    public ITeamServicePort teamServicePort(){
        return new TeamUseCase(teamPersistencePort());
    }

    @Bean
    public ITeamUserPersistencePort teamUserPersistencePort(){
        return new TeamUserJpaAdapter(teamUserRepository,teamUserMapper);
    }
    @Bean
    public ITeamUserServicePort teamUserServicePort(){
        return new TeamUserUseCase(teamUserPersistencePort());
    }

    @Bean
    public ITournamentPersistencePort tournamentPersistencePort(){
        return new TournamentJpaAdapter(tournamentRepository,tournamentMapper);
    }
    @Bean
    public ITournamentServicePort tournamentServicePort(){
        return new TournamentUseCase(tournamentPersistencePort());
    }

    @Bean
    public ITournamentModeratorPersistencePort tournamentModeratorPersistencePort(){
        return new TournamentModeratorJpaAdapter(tournamentModeratorRepository,tournamentModeratorMapper);
    }
    @Bean
    public ITournamentModeratorServicePort tournamentModeratorServicePort(){
        return new TournamentModeratorUseCase(tournamentModeratorPersistencePort());
    }

    @Bean
    public ITournamentTeamPersistencePort TournamentTeamPersistencePort(){
        return new TournamentTeamJpaAdapter(tournamentTeamRepository,tournamentTeamMapper);
    }
    @Bean
    public ITournamentTeamServicePort TournamentTeamServicePort(){
        return new TournamentTeamUseCase(TournamentTeamPersistencePort());
    }

    @Bean
    public IUserPersistencePort UserPersistencePort(){
        return new UserJpaAdapter(userRepository,userMapper);
    }
    @Bean
    public IUserServicePort UserServicePort(){
        return new UserUseCase(UserPersistencePort());
    }

    @Bean
    public ICategoryPersistencePort CategoryPersistencePort(){
        return new CategoryJpaAdapter(categoryRepository,categoryMapper);
    }
    @Bean
    public ICategoryServicePort CategoryServicePort(){
        return new CategoryUseCase(CategoryPersistencePort());
    }

    @Bean
    public IGameTypePersistencePort GameTypePersistencePort(){
        return new GameTypeJpaAdapter(gameTypeRepository,gameTypeMapper);
    }
    @Bean
    public IGameTypeServicePort GameTypeServicePort(){
        return new GameTypeUseCase(GameTypePersistencePort());
    }
}
