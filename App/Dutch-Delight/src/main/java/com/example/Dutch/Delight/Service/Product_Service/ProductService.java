package com.example.Dutch.Delight.Service.Product_Service;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Ingredient;
import com.example.Dutch.Delight.Model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product saveProduct(Product product);
    Product getProductById(long id);
    void deleteProductById(long id);
    public Product get(Long id);
    public List<Ingredient> getIngredients();
    public Category getCategoryById(Long id);
}
