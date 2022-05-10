package com.example.Dutch.Delight.Service.Table_Service;

import com.example.Dutch.Delight.Model.Masa;
import com.example.Dutch.Delight.Model.Product;

import java.util.List;

public interface TableService {
    List<Masa> listAll();
    Masa get(Long id);
    List<Product> getProductsOnTable();
    void saveTable(Masa masa);
    void deleteTableById(long id);
}
