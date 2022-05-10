package com.example.Dutch.Delight.Service.Category_Service;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Product;
import com.example.Dutch.Delight.Model.User;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category saveCategory(Category category);
    Category getCategoryById(long id);
    void deleteCategoryById(long id);
    public Category get(Long id);
    public List<Product> getProducts();

}
