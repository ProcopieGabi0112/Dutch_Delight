package com.example.Dutch.Delight.Service.RoleService;

import com.example.Dutch.Delight.Model.Role;
import com.example.Dutch.Delight.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired

    private RoleRepository roleRepo;

   public List<Role> listAll() {
        return roleRepo.findAll();
    }

    public Role get(Long id){
        return roleRepo.findById(id).get();
    }

    public void saveRole(Role role){
        roleRepo.save(role);
    }

    public void deleteById(long id){ roleRepo.deleteById(id); }
}
