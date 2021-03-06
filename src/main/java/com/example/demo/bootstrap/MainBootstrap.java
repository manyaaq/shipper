package com.example.demo.bootstrap;

import com.example.demo.model.User;
import com.example.demo.model.UserRole;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MainBootstrap implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRoleRepository userRoleRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
    try {
        User admin = new User("admin","admin","admin", "123");
        userRepository.save(admin);
        UserRole role = new UserRole("ROLE_ADMIN", admin);
        userRoleRepository.save(role);
        User user = new User("user","user","user", "123");
        userRepository.save(user);
        UserRole role1 = new UserRole("ROLE_USER", user);
        userRoleRepository.save(role1);

    }catch (Exception ex){
        System.out.println(ex.getCause()+ex.getMessage());
    }finally {
        System.out.println("Your app is working!");
    }
    }
}
