package com.example.Dutch.Delight.Controller;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Ingredient;
import com.example.Dutch.Delight.Model.Product;
import com.example.Dutch.Delight.Service.Product_Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Product_Controller {
    /* Product Controller*/

    @Autowired
    private ProductService productService;

    @GetMapping("/list_products")
    public String viewProductsPage(Model model){
        model.addAttribute("listProducts",productService.getAllProducts());
        return "products";
    }
    @PostMapping("/saveProduct")
    public String save_Product(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "redirect:/products";

    }
    @GetMapping("/products/edit/{id}")
    public String editCategory(@PathVariable("id") Long id, Model model) {
        Product product = productService.get(id);
        List<Ingredient> listIngredients=productService.getIngredients();
        model.addAttribute("product",product);
        model.addAttribute("listIngredients",listIngredients);
        return "product_form";
    }
    @PostMapping("/products/save")
    public String saveProduct(Product product){
        productService.saveProduct(product);
        return "list_products";
    }
    @GetMapping("/showProductForm")
    public String showProductForm(Model model){
        model.addAttribute("product",new Product());
        return "new_product";
    }

}
