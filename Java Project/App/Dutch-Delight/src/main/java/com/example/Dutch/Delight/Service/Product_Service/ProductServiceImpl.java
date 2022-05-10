package com.example.Dutch.Delight.Service.Product_Service;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Ingredient;
import com.example.Dutch.Delight.Model.Product;
import com.example.Dutch.Delight.Repository.CategoriesRepository;
import com.example.Dutch.Delight.Repository.IngredientsRepository;
import com.example.Dutch.Delight.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private IngredientsRepository ingredientsRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        this.productRepository.save(product);
        return product;
    }

    @Override
    public Product getProductById(long id) {
        Optional<Product> optional = productRepository.findById(id);
        Product product = null;
        if(optional.isPresent()) {
            product=optional.get();
        }else{
            throw new RuntimeException("Product not found for id ::" + id);
        }
        return product;
    }

    @Override
    public void deleteProductById(long id) {
        this.productRepository.deleteById(id);
    }

    public Product get(Long id){
        return productRepository.findById(id).get();
    }

    public List<Ingredient> getIngredients(){
        return ingredientsRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {

        return categoriesRepository.getById(id) ;
    }


}
