package com.example.Dutch.Delight.ServicesTests;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Ingredient;
import com.example.Dutch.Delight.Model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import javax.persistence.EntityManager;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("mysql")
@Rollback(false)
public class CascadeTypesTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    public void saveCategory(){

        Category category = new Category();
        category.setName("Mic dejun");

        Ingredient ingredient = new Ingredient();
        ingredient.setName("oua de prepelita");

        Product product = new Product();
        product.setName("Omleta");
        product.setPrice(25);
        category.setProducts(Arrays.asList(product));
        product.setCategorie(category);
        product.setIngredients(Arrays.asList(ingredient));
        category.setProducts(Arrays.asList(product));
        entityManager.persist(category);
        entityManager.flush();
        entityManager.clear();
    }
}
