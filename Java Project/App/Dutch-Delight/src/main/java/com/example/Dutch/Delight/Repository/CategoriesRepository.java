package com.example.Dutch.Delight.Repository;

import com.example.Dutch.Delight.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Category,Long> {

}
