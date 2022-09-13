package com.example.usermicroservice.service;

import com.example.usermicroservice.entity.User;
import com.example.usermicroservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User saveUser(User user) {
        log.info("Inside the service layer save user function");
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        log.info("Inside the controller layer find user function");
        return userRepository.findById(id).get();
    }
}
