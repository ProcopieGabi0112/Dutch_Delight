package com.example.Dutch.Delight.Service.Ingredient_Service;

import com.example.Dutch.Delight.Model.Ingredient;
import com.example.Dutch.Delight.Model.Product;
import com.example.Dutch.Delight.Repository.IngredientsRepository;
import com.example.Dutch.Delight.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Ingredient> getAllIngredients(){
        return ingredientsRepository.findAll();
    }

    @Override
    public Ingredient saveIngredient(Ingredient ingredient) {
        this.ingredientsRepository.save(ingredient);
        return ingredient;
    }

    @Override
    public Ingredient getIngredientById(long id) {
        Optional<Ingredient> optional = ingredientsRepository.findById(id);
        Ingredient ingredient = null;
        if(optional.isPresent()) {
            ingredient=optional.get();
        }else{
            throw new RuntimeException("Ingredient not found for id ::" + id);
        }
        return ingredient;
    }

    @Override
    public void deleteIngredientById(long id) {
        this.ingredientsRepository.deleteById(id);
    }

    public Ingredient get(Long id){
        return ingredientsRepository.findById(id).get();
    }

    public Optional<Product> getIngredientProduct(Long id){ return productRepository.findById(id);}


}
