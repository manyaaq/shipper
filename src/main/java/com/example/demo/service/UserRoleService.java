package com.example.demo.service;


import com.example.demo.model.UserRole;

import java.util.List;

public interface UserRoleService {
    UserRole create (UserRole userRole);
    UserRole update (UserRole userRole);
    void delete (Long id);
    List<UserRole> getMyUserRoles(UserRole userRole);
    UserRole getById (Long id);
}
