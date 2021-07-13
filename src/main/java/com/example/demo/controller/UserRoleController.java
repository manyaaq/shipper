package com.example.demo.controller;

import com.example.demo.model.UserRole;
import com.example.demo.service.UserRoleService;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userRole")
@CrossOrigin("*")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;
    @PostMapping("/create")
    public UserRole create(UserRole userRole){
        return userRoleService.create(userRole);
    }
    @PostMapping("/update")
    public UserRole update(UserRole userRole){
        return userRoleService.update(userRole);
    }
    @GetMapping("/getMyUserRoles")
    public List<UserRole> getMyUserRoles(User user){
        return userRoleService.getMyUserRoles((UserRole) user);
    }
    @GetMapping("/getById")
    public UserRole getById(Long id){
        return userRoleService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById (@PathVariable Long id){
        userRoleService.delete(id);
    }
}

