package com.pragma.ggTournament.tournaments.infrastructure.configuration;

import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.CategoryEntity;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.entity.GameTypeEntity;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.ICategoryRepository;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.IGameTypeRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ICategoryRepository categoryRepository;
    private final IGameTypeRepository gameTypeRepository;

    public DataInitializer(ICategoryRepository categoryRepository, IGameTypeRepository gameTypeRepository) {
        this.categoryRepository = categoryRepository;
        this.gameTypeRepository = gameTypeRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (categoryRepository.count() == 0) {
            categoryRepository.save(new CategoryEntity(null, "Shooter", "FPS"));
            categoryRepository.save(new CategoryEntity(null, "Battle Royale", "BR"));
        }

        if (gameTypeRepository.count() == 0) {
            gameTypeRepository.save(new GameTypeEntity(null, "Eliminación Directa", 16));
            gameTypeRepository.save(new GameTypeEntity(null, "Todos contra todos", 32));
        }

        System.out.println("✅ Datos iniciales insertados.");
    }
}
