package com.example.Dutch.Delight.Controller;

import com.example.Dutch.Delight.Model.Ingredient;
import com.example.Dutch.Delight.Model.Product;
import com.example.Dutch.Delight.Service.Ingredient_Service.IngredientService;
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
public class Ingredient_Controller {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/list_ingredients")
    public String viewIngredientsPage(Model model){
        model.addAttribute("listIngredients",ingredientService.getAllIngredients());
        return "ingredients";
    }
    @PostMapping("/saveIngredient")
    public String save_Ingredient(@ModelAttribute("ingredient") Ingredient ingredient){
        ingredientService.saveIngredient(ingredient);
        return "redirect:/ingredients";

    }
    @GetMapping("/ingredients/edit/{id}")
    public String editIngredient(@PathVariable("id") Long id, Model model) {
        Ingredient ingredient = ingredientService.get(id);
        model.addAttribute("ingredient",ingredient);
        return "ingredient_form";
    }
    @PostMapping("/ingredients/save")
    public String saveIngredient(Ingredient ingredient){
        ingredientService.saveIngredient(ingredient);
        return "list_ingredients";
    }
    @GetMapping("/showIngredientForm")
    public String showIngredientForm(Model model){
        model.addAttribute("ingredient",new Ingredient());
        return "new_ingredient";
    }

}
