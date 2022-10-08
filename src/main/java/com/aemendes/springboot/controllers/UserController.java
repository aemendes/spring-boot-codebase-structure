package com.aemendes.springboot.controllers;

import com.aemendes.springboot.models.User;
import com.aemendes.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return this.userService.create(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }
}
