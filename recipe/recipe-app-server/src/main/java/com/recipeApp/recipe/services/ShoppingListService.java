package com.recipeApp.recipe.services;

import com.recipeApp.recipe.models.Ingredient;
import com.recipeApp.recipe.models.ShoppingList;
import com.recipeApp.recipe.repositories.IngredientsRepository;
import com.recipeApp.recipe.repositories.ShoppingListRepository;
import com.recipeApp.recipe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingListService {

    @Autowired
    private ShoppingListRepository shoppingListRepository;

    @Autowired
    private UserRepository userRepository; // Assuming you have a UserRepository

    @Autowired
    private IngredientsRepository ingredientRepository; // Assuming you have an IngredientRepository

//    public List<ShoppingList> getShoppingListsByUserId(String userId) {
//        return shoppingListRepository.findByUserId(userId);
//    }

    public ShoppingList getShoppingListByUserId(String userId) {
        return shoppingListRepository.findByUserId(userId).stream().findFirst().orElse(null);
    }

//    public ShoppingList addShoppingList(ShoppingList shoppingList) {
//        return shoppingListRepository.save(shoppingList);
//    }

    public ShoppingList addShoppingList(ShoppingList shoppingList) {
        // Check if user already has a shopping list
        ShoppingList existingShoppingList = getShoppingListByUserId(shoppingList.getUser().getId());
        if (existingShoppingList != null) {
            return existingShoppingList;
        }
        return shoppingListRepository.save(shoppingList);
    }
    public ShoppingList addItemToShoppingList(String shoppingListId, ShoppingList.ShoppingListItem item) {
        ShoppingList shoppingList = shoppingListRepository.findById(shoppingListId).orElseThrow();
        shoppingList.getItems().add(item);
        return shoppingListRepository.save(shoppingList);
    }

    public ShoppingList deleteItemFromShoppingList(String shoppingListId, String ingredientName) {
        ShoppingList shoppingList = shoppingListRepository.findById(shoppingListId).orElseThrow();
        shoppingList.getItems().removeIf(item -> item.getIngredient().equals(ingredientName));
        return shoppingListRepository.save(shoppingList);
    }
}
