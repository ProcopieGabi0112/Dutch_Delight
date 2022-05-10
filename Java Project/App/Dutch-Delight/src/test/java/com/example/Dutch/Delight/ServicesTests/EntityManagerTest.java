package com.example.Dutch.Delight.ServicesTests;

import com.example.Dutch.Delight.Model.Category;
import com.example.Dutch.Delight.Model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Replace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("mysql")
public class EntityManagerTest {
    @Autowired
    private EntityManager entityManager;

    @Test
    public void findProduct(){
        Product productFound = entityManager.find(Product.class,1L);
        assertEquals(productFound.getName(),"Salata bulgareasca");
    }
    @Test
    public void updateProduct(){
        Product productFound = entityManager.find(Product.class,1L);
        productFound.setName("Salata bulgareasca");
        entityManager.persist(productFound);
        entityManager.flush();
    }
    @Test
    public  void findName(){
        Product productFound = entityManager.find(Product.class,1L);
        assertEquals(productFound.getName(),"Salata bulgareasca");
    }
}
