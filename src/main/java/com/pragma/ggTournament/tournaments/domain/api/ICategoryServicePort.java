package com.pragma.ggTournament.tournaments.domain.api;

import com.pragma.ggTournament.tournaments.domain.model.Category;

import java.util.List;

public interface ICategoryServicePort {
    Category getCategoryById(Long id);
    List<Category> getListCategory();
}
