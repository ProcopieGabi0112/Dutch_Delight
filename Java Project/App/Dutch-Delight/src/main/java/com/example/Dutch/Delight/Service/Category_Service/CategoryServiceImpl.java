package com.example.Dutch.Delight.Service.Category_Service;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Product;
import com.example.Dutch.Delight.Repository.CategoriesRepository;
import com.example.Dutch.Delight.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Category> getAllCategories(){
        return categoriesRepository.findAll();
    }

    @Override
    public Category saveCategory(Category category) {
        this.categoriesRepository.save(category);
        return category;
    }

    @Override
    public Category getCategoryById(long id) {
        Optional<Category> optional = categoriesRepository.findById(id);
        Category category = null;
        if(optional.isPresent()) {
            category=optional.get();
        }else{
            throw new RuntimeException("Category not found for id ::" + id);
        }
        return category;
    }

    @Override
    public void deleteCategoryById(long id) {
         this.categoriesRepository.deleteById(id);
    }

    public Category get(Long id){
        return categoriesRepository.findById(id).get();
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }


}
