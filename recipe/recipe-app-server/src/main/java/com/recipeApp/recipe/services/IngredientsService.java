package com.recipeApp.recipe.services;

import com.recipeApp.recipe.models.Ingredient;
import com.recipeApp.recipe.repositories.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsService {

    @Autowired
    private IngredientsRepository ingredientRepository;

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Ingredient getIngredientById(String id) {
        return ingredientRepository.findById(id).orElse(null);
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public Ingredient updateIngredient(String id, Ingredient ingredient) {
        ingredient.setId(id);
        return ingredientRepository.save(ingredient);
    }

    public void deleteIngredient(String id) {
        ingredientRepository.deleteById(id);
    }
}
