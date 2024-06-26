package com.recipeApp.recipe.controllers;



import com.recipeApp.recipe.entities.Recipes;
import com.recipeApp.recipe.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/api/recipes")
public class RecipesController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping
    public List<Recipes> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/{id}")
    public Recipes getRecipeById(@PathVariable String id) {
        return recipeService.getRecipeById(id);
    }

    @PostMapping
    public Recipes createRecipe(@RequestBody Recipes recipe) {
        return recipeService.createRecipe(recipe);
    }

    @PutMapping("/{id}")
    public Recipes updateRecipe(@PathVariable String id, @RequestBody Recipes recipe) {
        return recipeService.updateRecipe(id, recipe);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRecipe(@PathVariable String id) {
        recipeService.deleteRecipe(id);
        return ResponseEntity.ok().build();
    }
}

