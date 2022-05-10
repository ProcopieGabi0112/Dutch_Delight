package com.example.Dutch.Delight.Controller;

import com.example.Dutch.Delight.Model.*;
import com.example.Dutch.Delight.Service.Table_Service.TableService;
import com.example.Dutch.Delight.Service.User_Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class Table_Controller {

    @Autowired
    private TableService tableService;

    @GetMapping("/newTableForm")
    public String showTableForm(Model model){
        model.addAttribute("table",new Masa());
        return "new_table";
    }

    @GetMapping("/list_tables")
    public String viewTablesList(Model model){
        List<Masa> listTables = tableService.listAll();
        model.addAttribute("listTables",listTables);

        return "tables";
    }

    @GetMapping("/tables/edit/{id}")
    public String editTable(@PathVariable("id") Long id, Model model) {
        Masa masa = tableService.get(id);
        List<Product> listProducts=tableService.getProductsOnTable();
        model.addAttribute("masa",masa);
        model.addAttribute("listProducts",listProducts);
        return "table_form";
    }
    @PostMapping("/saveTable")
    public String save_Table(@ModelAttribute("table") Masa masa){
        tableService.saveTable(masa);
        return "redirect:/tables";

    }
}
