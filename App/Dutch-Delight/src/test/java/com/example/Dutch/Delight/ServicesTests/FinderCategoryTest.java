package com.example.Dutch.Delight.ServicesTests;


import com.example.Dutch.Delight.Model.Category;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("mysql")
@Rollback(false)
@Slf4j
public class FinderCategoryTest {
  /*
   @Autowired
    private CategoryRepository categoryRepository;

   @Test
    public void findByName(){
       List<Category> categories = categoryRepository.findByNameLike("%la%");
       assertFalse(categories.isEmpty());
       log.info("findByNameLike ...");
       categories.forEach(category -> log.info(category.getName()));
   }

    @Test
    public void findByIds(){
        List<Category> categories = categoryRepository.findByIdIn(Arrays.asList(1L,2L));
        assertFalse(categories.isEmpty());
        log.info("findByIds ...");
        categories.forEach(category -> log.info(category.getName()));
    }

*/

}
