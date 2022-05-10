package com.example.Dutch.Delight.Service.Ingredient_Service;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Ingredient;
import com.example.Dutch.Delight.Model.Product;

import java.util.List;
import java.util.Optional;

public interface IngredientService {
    List<Ingredient> getAllIngredients();
    Ingredient saveIngredient(Ingredient ingredient);
    Ingredient getIngredientById(long id);
    void deleteIngredientById(long id);
    Ingredient get(Long id);
    Optional<Product> getIngredientProduct(Long id);
}
