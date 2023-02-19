package com.example.real_estate_api.services;

import com.example.real_estate_api.models.User;
import com.example.real_estate_api.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {
    @Autowired
    private UsersRepository usersRepository;
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public String register(User user){

        User usr = usersRepository.findByEmail(user.getEmail());

        if(usr == null){
            user.setPassword(passwordEncoder.encode(user.getPassword()));

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
        } else if (!passwordEncoder.matches(password, usr.getPassword())) {
            return "Wrong Credentials. password";
        } else {
            return "Logged In";
        }
    }

    public List<User> getAllUsers(){
        return usersRepository.findAll();
    }

    public Optional<User> getSpecificUser(int id){
        return usersRepository.findById(id);
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
