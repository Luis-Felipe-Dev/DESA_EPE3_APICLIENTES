package org.example.springdatajpacliente.controller;

import org.example.springdatajpacliente.entity.User;
import org.example.springdatajpacliente.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping({"/", "getall"})
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
