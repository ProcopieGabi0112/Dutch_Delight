package com.example.Dutch.Delight.Service.Table_Service;

import com.example.Dutch.Delight.Model.*;
import com.example.Dutch.Delight.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TableRepository tableRepo;

    @Autowired
    private ProductRepository productRepo;


    public List<Masa> listAll() {
        return tableRepo.findAll();
    }

    public Masa get(Long id){
        return tableRepo.findById(id).get();
    }

    public List<Product> getProductsOnTable(){
        return productRepo.findAll();
    }

    public void saveTable(Masa masa){
       tableRepo.save(masa);
    }
    public void deleteTableById(long id){
        tableRepo.deleteById(id);

    }


}
