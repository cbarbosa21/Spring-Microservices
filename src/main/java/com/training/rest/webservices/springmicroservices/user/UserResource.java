package com.training.rest.webservices.springmicroservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDAOService service;

    // GET /users
    // retrieve all users
    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return service.findAll();
    }

    // GET /users/{id}
    // retrieve user
    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable int id) {
        return service.findOne(id);
    }
}
