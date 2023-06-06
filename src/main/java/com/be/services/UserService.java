package com.be.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.be.models.User;
import com.be.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<User> findUserById(String id) {
        try {
            User user = userRepository.findById(id).orElseThrow(() -> new Error("User not found."));
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

}
