package com.recipeApp.recipe.controllers;

import com.recipeApp.recipe.entities.Ingredients;
import com.recipeApp.recipe.services.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/ingredients")
public class IngredientsController {

    @Autowired
    private IngredientsService ingredientService;

    @GetMapping
    public List<Ingredients> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/{id}")
    public Ingredients getIngredientById(@PathVariable Integer id) {
        return ingredientService.getIngredientById(id);
    }

    @PostMapping
    public Ingredients createIngredient(@RequestBody Ingredients ingredient) {
        return ingredientService.createIngredient(ingredient);
    }

    @PutMapping("/{id}")
    public Ingredients updateIngredient(@PathVariable Integer id, @RequestBody Ingredients ingredient) {
        return ingredientService.updateIngredient(id, ingredient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIngredient(@PathVariable Integer id) {
        ingredientService.deleteIngredient(id);
        return ResponseEntity.ok().build();
    }
}
