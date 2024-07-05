package com.recipeApp.recipe.repositories;

import com.recipeApp.recipe.models.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends MongoRepository<Ingredient, String> {
    Ingredient findByName(String name);
}