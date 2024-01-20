package com.example.splitwisefinal.services;


import com.example.splitwisefinal.models.User;
import com.example.splitwisefinal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public  UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User getUser(Long userId) throws  Exception{
        Optional<User>  userOptional  = userRepository.findById(userId);
        if (userOptional.isEmpty()){
            throw new Exception("User not found ");
        }
        return  userOptional.get();

    }

     public  User registerUser( User user){
        User  savedUser  = userRepository.save(user);
        return savedUser;

     }

}
