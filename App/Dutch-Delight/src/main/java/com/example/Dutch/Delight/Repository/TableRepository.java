package com.example.Dutch.Delight.Repository;

import com.example.Dutch.Delight.Model.Masa;
import com.example.Dutch.Delight.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Masa,Long> {

   /* @Query("SELECT u FROM Masa u WHERE u.number= ?1 ")
    User findByNumber(int nr);*/
}
