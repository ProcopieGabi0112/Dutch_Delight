package com.example.Dutch.Delight.RepositoriesTests;

import com.example.Dutch.Delight.Model.Category;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("mysql")
@Rollback(false)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Slf4j
public class CategoryRepositoryTest {

    /*@Autowired
    CategoryRepository categoryRepository;

    @Test
    @Order(1)
    public void addCategory(){
        Category category = new Category();
        category.setName("Mic dejun");
        categoryRepository.save(category);
    }

    @Test
    @Order(2)
    public void findByName(){
     List<Category> categories = categoryRepository.findByNameLike("%la%");
     assertFalse(categories.isEmpty());
     log.info("findByNameLike ...");
     categories.forEach(category -> log.info(category.getName()));
    }

    @Test
    @Order(3)
    public void findByIds(){
        List<Category> categories = categoryRepository.findByIdIn(Arrays.asList(1L,2L));
        assertFalse(categories.isEmpty());
        log.info("findByIds ...");
        categories.forEach(category -> log.info(category.getName()));

    }
*/

}
