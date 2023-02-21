package com.example.real_estate_api.controllers;

import com.example.real_estate_api.models.User;
import com.example.real_estate_api.services.UsersServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/users")
@Tag(name="Users")
public class UsersController {
    @Autowired
    private UsersServices usersServices;
    @PostMapping(value="/register")
    @Operation(summary = "Register User")
    public String register(@RequestBody User user){
        return usersServices.register(user);
    }

    @PostMapping(value="/login")
    @Operation(summary = "Authenticate to Use API")
    public String login(@RequestBody User user){
        return usersServices.login(user.getEmail(), user.getPassword());
    }

    @GetMapping
    @Operation(summary = "Get All Users")
    public List<User> getAllUsers(){
        return usersServices.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Get A Specific User")
    public Optional<User> getSpecificUser(@PathVariable("id") int id){
        return usersServices.getSpecificUser(id);
    }

    @PutMapping(value = "/{id}")
    @Operation(summary = "Update User's Details")
    public String updateUser(@PathVariable("id") int id, @RequestBody User usr){
        return usersServices.updateUser(id, usr);
    }

    @DeleteMapping(value = "/{id}")
    @Operation(summary = "Delete a User")
    public String deleteUser(@PathVariable("id") int id){
        return usersServices.deleteUser(id);
    }

}

