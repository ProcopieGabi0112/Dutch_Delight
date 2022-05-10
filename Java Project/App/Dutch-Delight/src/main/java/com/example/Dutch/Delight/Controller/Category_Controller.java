package com.example.Dutch.Delight.Controller;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Product;
import com.example.Dutch.Delight.Service.Category_Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Category_Controller {

    /*Category Controller */

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/showCategoryForm")
    public String showCategoryForm(Model model){
        model.addAttribute("category",new Category());
        return "new_category";
    }

    @GetMapping("/product_categories")
    public String viewCategoryPage(Model model){
        model.addAttribute("listCategories",categoryService.getAllCategories());
        return "categories";
    }
    @PostMapping("/saveCategory")
    public String saveoneCategory(@ModelAttribute("category") Category category){
        categoryService.saveCategory(category);
        return "redirect:/product_categories";

    }
    @GetMapping("/categories/edit/{id}")
    public String editoneCategory(@PathVariable("id") Long id, Model model) {
        Category category = categoryService.get(id);
        List<Product> listProducts=categoryService.getProducts();
        model.addAttribute("category",category);
        model.addAttribute("listProducts",listProducts);
        return "category_form";
    }
    @PostMapping("/categories/save")
    public String saveCategory(Category category){
        categoryService.saveCategory(category);

        return "redirect:/product_categories";
    }

}
