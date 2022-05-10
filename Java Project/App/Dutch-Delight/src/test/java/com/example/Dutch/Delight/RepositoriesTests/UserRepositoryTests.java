package com.example.Dutch.Delight.RepositoriesTests;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.Dutch.Delight.Model.Role;
import com.example.Dutch.Delight.Model.User;
import com.example.Dutch.Delight.Repository.RoleRepository;
import com.example.Dutch.Delight.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoleRepository roleRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("procopiegabi@gmail.com");
        user.setPassword("gabi0112");
        user.setFirstName("Gabi");
        user.setLastName("Procopie");

        User savedUser =userRepo.save(user);
        User existUser = entityManager.find(User.class,savedUser.getId());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }

    @Test
    public void testFindUserByEmail(){
        String email = "procopiegabi@gmail.com";
        User user = userRepo.findByEmail(email);
        assertThat(user).isNotNull();
    }

    @Test
    public void testAddRoleToNewUser(){
        User user = new User();
        user.setEmail("dprocopie@yahoo.com");
        user.setPassword("dorna987");
        user.setFirstName("Victor");
        user.setLastName("Procopie");

        Role roleUser = roleRepo.findByName("User");
        user.addRole(roleUser);

        User savedUser =userRepo.save(user);

        assertThat(savedUser.getRoles().size()).isEqualTo(1);

    }

    @Test
    public void testAddRolesToExistingUser(){
       User user = userRepo.findById(1L).get();

        Role roleUser = roleRepo.findByName("User");
        user.addRole(roleUser);

        Role roleAdmin = new Role(2L);
        user.addRole(roleAdmin);

        User savedUser =userRepo.save(user);

        assertThat(savedUser.getRoles().size()).isEqualTo(2);
    }

}
