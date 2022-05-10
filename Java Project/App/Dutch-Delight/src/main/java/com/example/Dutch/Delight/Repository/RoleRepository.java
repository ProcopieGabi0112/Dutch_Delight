package com.example.Dutch.Delight.Repository;

import com.example.Dutch.Delight.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query(value = "SELECT r FROM Role r WHERE r.name=?1")
    public Role findByName(String name);

    /*@Query(value="DELETE FROM users_roles p WHERE p.user_id = :id")
    void deleteRoleFrom(@Param("id") Long i);
                             */

}
