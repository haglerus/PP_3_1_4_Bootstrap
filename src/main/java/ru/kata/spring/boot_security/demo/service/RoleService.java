package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> listRoles();

    Role getRole(Long id);

//    Role getRole(String roleName);
}