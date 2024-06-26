package com.recipeApp.recipe.services;

import com.recipeApp.recipe.entities.Ingredients;
import com.recipeApp.recipe.repositories.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsService {

    @Autowired
    private IngredientsRepository ingredientRepository;

    public List<Ingredients> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Ingredients getIngredientById(Integer id) {
        return ingredientRepository.findById(id).orElse(null);
    }

    public Ingredients createIngredient(Ingredients ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public Ingredients updateIngredient(Integer id, Ingredients ingredient) {
        ingredient.setId(id);
        return ingredientRepository.save(ingredient);
    }

    public void deleteIngredient(Integer id) {
        ingredientRepository.deleteById(id);
    }
}
