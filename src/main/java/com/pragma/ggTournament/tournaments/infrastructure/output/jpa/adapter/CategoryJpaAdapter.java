package com.pragma.ggTournament.tournaments.infrastructure.output.jpa.adapter;

import com.pragma.ggTournament.tournaments.domain.model.Category;
import com.pragma.ggTournament.tournaments.domain.spi.ICategoryPersistencePort;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.mapper.ICategoryEntityMapper;
import com.pragma.ggTournament.tournaments.infrastructure.output.jpa.repository.ICategoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CategoryJpaAdapter implements ICategoryPersistencePort {

    private final ICategoryRepository categoryRepository;
    private final ICategoryEntityMapper categoryMapper;

    @Override
    public Category getCategoryById(Long id) {
        return categoryMapper.toCategory(categoryRepository.findById(id).orElseThrow());
    }

    @Override
    public List<Category> getListCategory() {
        return categoryMapper.toListCategory(categoryRepository.findAll());
    }
}
