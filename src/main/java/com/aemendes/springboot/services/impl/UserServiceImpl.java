package com.aemendes.springboot.services.impl;

import com.aemendes.springboot.models.User;
import com.aemendes.springboot.repository.UserRepository;
import com.aemendes.springboot.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    final private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) this.userRepository.findAll();
    }
}
