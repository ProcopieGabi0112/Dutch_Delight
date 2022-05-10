package com.example.Dutch.Delight.Repository;

import com.example.Dutch.Delight.Model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredient,Long> {

}
