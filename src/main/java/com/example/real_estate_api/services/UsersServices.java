package com.example.real_estate_api.services;

import com.example.real_estate_api.models.User;
import com.example.real_estate_api.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsersServices {
    @Autowired
    private UsersRepository usersRepository;

    public String register(User user){

        User usr = usersRepository.findByEmail(user.getEmail());

        if(usr == null){
            usersRepository.save(user);
            return "User Added";
        }else{
            return "Email already Exists";
        }
    }

    public String login(String email, String password) {
        User usr = usersRepository.findByEmail(email);

        if (ObjectUtils.isEmpty(usr)) {
            return "Wrong Credentials ";
        } else if (!usr.getPassword().equalsIgnoreCase(password) ) {
            return "Wrong Credentials. password";
        } else {
            return "Logged In";
        }
    }

    public String updateUser(int id, User usr){
        User existinguser =  usersRepository.findById(id).orElse(null);

        if(ObjectUtils.isEmpty(existinguser)){
            return "User Does Not Exist";
        }else{
            existinguser.setEmail(usr.getEmail());
            existinguser.setPassword(usr.getPassword());

            usersRepository.save(existinguser);
            return "User Updated";
        }
    }

    public String deleteUser(int id){
        User usr = usersRepository.findById(id).orElse(null);

        if(ObjectUtils.isEmpty(usr)){
            return "User Does Not Exist";
        }else{
            usersRepository.deleteById(id);
            return "Deleted";
        }

    }


}
