package com.example.Dutch.Delight.Repository;

import com.example.Dutch.Delight.Model.Product;
import com.example.Dutch.Delight.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

   /* @Query(value = "SELECT r FROM Product r WHERE r.name=?1")
    public Role findByName(String name);

    @Query("select p from Product p where p.category.id= ?1")
    List<Product> findByCategoryId(Long category_id);

    @Query("select p from Product p where p.category.name = :name")
    List<Product> findByCategoryName(@Param("name") String category_name);*/
}
