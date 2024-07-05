package com.recipeApp.recipe.controllers;

import com.recipeApp.recipe.models.ShoppingList;
import com.recipeApp.recipe.services.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RequestMapping("/api/shopping")
public class ShoppingListController {

    @Autowired
    private ShoppingListService shoppingListService;

    @GetMapping("/user/{userId}")
    public ShoppingList getShoppingListsByUserId(@PathVariable String userId) {
        return shoppingListService.getShoppingListByUserId(userId);
    }

    @PostMapping
    public ShoppingList addShoppingList(@RequestBody ShoppingList shoppingList) {
        return shoppingListService.addShoppingList(shoppingList);
    }

    @PutMapping("/{shoppingListId}")
    public ShoppingList addItemToShoppingList(@PathVariable String shoppingListId, @RequestBody ShoppingList.ShoppingListItem item) {
        return shoppingListService.addItemToShoppingList(shoppingListId, item);
    }

    @DeleteMapping("/{shoppingListId}/items")
    public ShoppingList deleteItemFromShoppingList(@PathVariable String shoppingListId, @RequestParam String ingredientName) {
        return shoppingListService.deleteItemFromShoppingList(shoppingListId, ingredientName);
    }
}