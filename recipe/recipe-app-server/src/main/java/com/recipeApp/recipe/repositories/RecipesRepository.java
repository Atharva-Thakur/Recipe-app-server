package com.recipeApp.recipe.repositories;

import com.recipeApp.recipe.models.Recipes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipesRepository extends MongoRepository<Recipes, String>{
    List<Recipes> findByTitleContaining(String title);

    Recipes findByTitle(String title);

}
