package com.recipeApp.recipe.repositories;

import com.recipeApp.recipe.entities.Ingredients;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends MongoRepository<Ingredients, String> {
    Ingredients findByName(String name);
}