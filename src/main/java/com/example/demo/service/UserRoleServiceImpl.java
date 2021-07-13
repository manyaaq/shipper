package com.example.demo.service;


import com.example.demo.model.UserRole;
import com.example.demo.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public UserRole create(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole update(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public void delete(Long id) {
    userRoleRepository.deleteById(id);
    }

    @Override
    public List<UserRole> getMyUserRoles(UserRole userRole) {
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole getById(Long id) {
        return userRoleRepository.findById(id).get();
    }
}
