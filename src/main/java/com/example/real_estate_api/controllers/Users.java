package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.User;
import com.example.real_estate_api.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users")
public class Users {
    @Autowired
    private UsersServices usersServices;
    @PostMapping()
    public String register(@RequestBody User user){
        return usersServices.register(user);
    }

    @GetMapping()
    public String login(@RequestBody User user){
        return usersServices.login(user.getEmail(), user.getPassword());
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
