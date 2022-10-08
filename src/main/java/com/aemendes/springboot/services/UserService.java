package com.aemendes.springboot.services;

import com.aemendes.springboot.models.User;

import java.util.List;

public interface UserService {
    User create(User user);

    List<User> getAllUsers();
}
