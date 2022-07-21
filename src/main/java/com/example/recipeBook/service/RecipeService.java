package com.example.recipeBook.service;

import com.example.recipeBook.enitity.Recipe;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RecipeService {
    ResponseEntity<Recipe> getRecipe(Long id);
    ResponseEntity<List<Recipe>> getAllRecipes();
    ResponseEntity<Recipe> addRecipe(Recipe recipe);
    ResponseEntity<Recipe> updateRecipe(Long id, Recipe recipe);
    ResponseEntity<String> deleteRecipe(Long id);
    ResponseEntity<String> deleteAllRecipes();
}
