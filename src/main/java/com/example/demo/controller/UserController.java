package com.example.demo.controller;

import com.example.demo.model.User;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create")
    public User create (@RequestBody User user){
        return userService.create(user);
    }
    @PostMapping("/update")
    public User update(@RequestBody User user){
        return  userService.update(user);
    }

    @GetMapping("/getMyUsers")
    public List<User> getMyUsers(){
        return userService.getMyUsers();
    }
    @GetMapping("/getById/{id}")//TODO: я добавил id в твой путь
    public User getById(@PathVariable Long id){//TODO: я добавил аннотацию PathVariable
        return userService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleted(id);
    }

}
