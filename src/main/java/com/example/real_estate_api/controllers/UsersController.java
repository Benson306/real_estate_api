package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.User;
import com.example.real_estate_api.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UsersController {
    @Autowired
    private UsersServices usersServices;
    @PostMapping(value="/register")
    public String register(@RequestBody User user){
        return usersServices.register(user);
    }

    @PostMapping(value="/login")
    public String login(@RequestBody User user){
        return usersServices.login(user.getEmail(), user.getPassword());
    }

    @GetMapping
    public List<User> getAllUsers(){
        return usersServices.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public Optional<User> getSpecificUser(@PathVariable("id") int id){
        return usersServices.getSpecificUser(id);
    }

    @PutMapping(value = "/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody User usr){
        return usersServices.updateUser(id, usr);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteUser(@PathVariable("id") int id){
        return usersServices.deleteUser(id);
    }

}

