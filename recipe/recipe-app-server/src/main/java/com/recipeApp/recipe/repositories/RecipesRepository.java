package com.recipeApp.recipe.repositories;

import com.recipeApp.recipe.entities.Recipes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipesRepository extends MongoRepository<Recipes, String>{
    List<Recipes> findByTitleContaining(String title);
    List<Recipes> findByIngredientsNameContaining(String name);

    Recipes findByTitle(String title);

}
