package com.pragma.ggTournament.tournaments.domain.spi;

import com.pragma.ggTournament.tournaments.domain.model.Category;

import java.util.List;

public interface ICategoryPersistencePort {
    Category getCategoryById(Long id);
    List<Category> getListCategory();
}
