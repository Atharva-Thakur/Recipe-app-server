package com.recipeApp.recipe.repositories;

import com.recipeApp.recipe.models.Ingredients;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends MongoRepository<Ingredients, Integer> {
    Ingredients findByName(String name);
}